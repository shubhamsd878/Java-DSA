// IMPORTANT not traversing disconnected graphs probably correct
// in DFS we use stack in comparison to BFS
package Graphs_AnujBhaiya;

import java.util.*;

public class _04_DFS {
    static void addEdge(ArrayList<ArrayList<Integer>> a, int source, int destination){
        a.get(source).add(destination);
        a.get(destination).add(source);
    }

    // DFS two methods --> Stack + Queue  &&  Recursion
    static void DFS (ArrayList<ArrayList<Integer>> adj, int S, int v){      //s = Source (initial vertex),  v = no. of vertex
        Stack<Integer> stack = new Stack<Integer>();
        boolean visited[] = new boolean [v];

        // for loop for 
        for(int i = 0; i < v; i++ ){
            visited[i] = false;
        }

        stack.add(S);
        visited[S] = true;

        while(!stack.isEmpty()){
            int u = stack.pop();
            System.out.println( u );

            for(int i = 0; i<adj.get( u ).size(); i++){
                int neighbour = adj.get( u ).get(i);

                if( visited[neighbour] == false){
                    stack.add(neighbour);
                    visited[neighbour] = true;
                }

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
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 0);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 3);

        // printing
        DFS(adj, 2, v);

    }
}