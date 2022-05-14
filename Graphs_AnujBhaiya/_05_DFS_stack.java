package Graphs_AnujBhaiya;

import java.util.*;

public class _05_DFS_stack {

    static void addEdge(ArrayList<ArrayList<Integer>> a, int source, int destination){
        a.get(source).add(destination);
        a.get(destination).add(source);
    }

    // DFS two methods --> Stack + Queue  &&  Recursion
    static void DFS (ArrayList<ArrayList<Integer>> adj, int S, int v){      //s = Source (initial vertex),  v = no. of vertex
        
        boolean visited[] = new boolean [v];
        DFSutil(adj, visited, S, v);
    }

    static void DFSutil(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int S, int v){

        visited[S] = true;
        // first print
        System.out.println( S );

        for(int i = 0; i < adj.get(S).size(); i++){
            int neighbour = adj.get(S).get(i);
            
            if(visited[neighbour] == false){
                DFSutil(adj, visited, neighbour, v);
            }
        }
    }

    public static void main(String[] args){
        int v= 5;
        int e =10;

        // most important line
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v); 

        // most important
        for(int i = 0; i < v; i++){
            adj.add(new ArrayList<Integer>());
        }

        // adding edges
        // addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        // addEdge(adj, 2, 0);
        addEdge(adj, 0, 3);
        addEdge(adj, 3, 4);
        // addEdge(adj, 3, 3);

        // printing
        DFS(adj, 2, v);

    }
}
