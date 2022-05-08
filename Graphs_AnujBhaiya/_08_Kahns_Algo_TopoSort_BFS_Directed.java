
package Graphs_AnujBhaiya;
import java.util.*;


public class _08_Kahns_Algo_TopoSort_BFS_Directed {
    static void addEdge(ArrayList<ArrayList<Integer>> a, int source, int destination){
        a.get(source).add(destination);
        // destination to source not required as this is directed graph
        // a.get(destination).add(source);      
    }

    static void topoSort(ArrayList<ArrayList<Integer>> adj, int v){
        int topoResult[] =  new int[v];
        int inDegree[] = new int[v];
        Queue<Integer> q = new LinkedList<Integer>();

        //calculating indegree
        for(int i = 0; i < v; i++){
            for(int j = 0; j < adj.get(i).size(); j++){
                inDegree[ adj.get(i).get(j) ]++;
            }
        }

        // adding vertex with indegree - initially
        for(int i = 0; i<v; i++){
            if(inDegree[i] == 0){
                q.add(i);
            }
        }
        
        // index for topoResult array
        int idx = 0;

        // while loop until q become empty
        while(!q.isEmpty()){
            int node = q.poll();

            // ouputting to resultArray
            topoResult[idx] = node;
            idx++;

            // traversing to all adjacent nodes to decrease indegree by one
            for(int i =0; i < adj.get(node).size(); i++){
                inDegree[ adj.get(node).get(i) ]--;

                if( inDegree[adj.get(node).get(i)] == 0 ){
                    q.add( adj.get(node).get(i));
                }
            }
        }

        // outputting topoResult
        for(int i = 0; i<topoResult.length; i++){
            System.out.println( topoResult[i] );
        }

    }
    
    public static void main(String[] args){
        int v= 6;

        // most important line
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v); 

        // most important
        for(int i = 0; i < v; i++){
            adj.add(new ArrayList<Integer>());
        }

        // adding edges
        addEdge(adj, 5, 0);
        addEdge(adj, 5, 2);
        addEdge(adj, 4, 0);
        addEdge(adj, 4, 1);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 1);

        // printing
        topoSort(adj, v);

    }

}