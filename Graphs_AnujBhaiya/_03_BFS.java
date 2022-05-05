package Graphs_AnujBhaiya;

import java.util.*;

public class _03_BFS {
    static void addEdge(ArrayList<ArrayList<Integer>> a, int source, int destination){
        a.get(source).add(destination);
        a.get(destination).add(source);
    }

    static void BFS (ArrayList<ArrayList<Integer>> adj, int S, int v){      //s = Source (initial vertex),  v = no. of vertex
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean [v];

        for(int i = 0; i < v; i++ ){
            visited[i] = false;
        }

        q.add(S);
        visited[S] = true;

        while(!q.isEmpty()){
            int u = q.remove();
            System.out.println( u );

            for(int i = 0; i<adj.get( u ).size(); i++){
                int neighbour = adj.get( u ).get(i);
                if( visited[neighbour] == false){
                    q.add(neighbour);
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
        BFS(adj, 2, v);

    }
}