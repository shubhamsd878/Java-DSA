// most important
package Graphs_AnujBhaiya;

import java.util.ArrayList;

public class _02_Adjancy_List {

    
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
        addEdge(adj, 0, 3);
        addEdge(adj, 1, 2);

        // printing 
        for(int i =0; i<v; i++){
            System.out.print("Vertex " + v + ": ");
            for(int j=0; j < adj.get(i).size(); j++){
                System.out.print(adj.get(i).get(j) + " -> ");
            }
            System.out.println();
        }

    }

    static void addEdge(ArrayList<ArrayList<Integer>> a, int source, int destination){

        a.get(source).add(destination);
        a.get(destination).add(source);
    }


}
