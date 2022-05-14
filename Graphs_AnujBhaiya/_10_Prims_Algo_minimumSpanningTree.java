// ?? IMPORTANT why Node class is outside main
// IMPORTANT for weighted graph special Node data type need to specify 
package Graphs_AnujBhaiya;
import java.util.*;


class Node{
    int data;
    int weight;

    Node(int _v, int _w){
        data = _v;
        weight = _w;
    }

    int getV () { return data; }
    int getW () { return weight; }
}

public class _10_Prims_Algo_minimumSpanningTree{
    
    static void prims_Algo(ArrayList<ArrayList<Node>> adj, int v ){
        int key[] = new int[v];
        boolean MST[] = new boolean[v];
        int parent[] = new int[v];

        for(int i = 0; i<v; i++){
            key[i] = 1000000;
            MST[i] = false;
            parent[i] = -1;
        }

        key[0] = 0;     //as starting point hence 0 weight

        for(int i = 0; i < v-1; i++){       // v-1 edges for v vertices

            // finding minimum key
            int mini = 1000000, u = 0;
            // for(int j = 0; j < adj.get(i).size(); j++){
            for(int j = 0; j < v; j++){
                if( MST[j] == false && key[j] < 1000000){
                    mini = key[j];
                    u = j;
                }
    
            }
            
            //setting mst of minimum key to true;
            MST[u] = true;

            for(int j = 0; j< adj.get(u).size(); j++){
                // not understood, but if      MST[neighbour] == F && weight < Key[neighbour] then update key and parent 
                Node neighbour = adj.get(u).get(j);
                // System.out.println(neighbour.weight);
                // if( MST[ adj.get(u).get(j).getV() ] == false && adj.get(u).get(j).getW() < key[ adj.get(u).get(j).getV() ] ){
                if( MST[ neighbour.getV() ] == false && neighbour.getW() < key[ neighbour.getV() ] ){

                    // Not to do
                    // key[ j ] = adj.get(u).get(j).getW();
                    // parent[ j ] = u; 

                    // Most important
                    key[ neighbour.getV()] = adj.get(u).get(j).getW();
                    parent[ neighbour.getV() ] = u; 

                }
            }

            // for(Node it: adj.get(u)) {
        	// 	if(MST[it.getV()] == false && it.getW() < key[it.getV()]) {
        	// 		parent[it.getV()] = u; 
        	// 		key[it.getV()] = it.getW(); 
        	// 	}
        	// }

            
        }
        
        //printing minimum spanning tree
        for(int i = 1; i<v; i++){
            System.out.println(parent[i] + " --> " + i);
        }
    }



    public static void main(String[] args){
        int v = 5;

        ArrayList<ArrayList<Node>> adj = new ArrayList<ArrayList<Node>>();

        for(int i = 0; i < v; i++){
            adj.add( new ArrayList<Node>() );
        }
        
        adj.get(0).add(new Node(1, 2));
        adj.get(1).add(new Node(0, 2));

        adj.get(0).add(new Node(3, 6));
        adj.get(3).add(new Node(0, 6));

        adj.get(1).add(new Node(2, 3));
        adj.get(2).add(new Node(1, 3));

        adj.get(1).add(new Node(3, 8));
        adj.get(3).add(new Node(1, 8));

        adj.get(1).add(new Node(4, 5));
        adj.get(4).add(new Node(1, 5));

        adj.get(2).add(new Node(4, 5));
        adj.get(4).add(new Node(2, 5));

        adj.get(2).add(new Node(4, 7));
        adj.get(4).add(new Node(2, 7));
        // adj.get(2).add(new Node(4, 5));

        prims_Algo(adj, v);
    }
}