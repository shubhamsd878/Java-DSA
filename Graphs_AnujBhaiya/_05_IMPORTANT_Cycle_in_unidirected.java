// IMPORTANT
package Graphs_AnujBhaiya;
import java.util.*;


public class _05_IMPORTANT_Cycle_in_unidirected {
    static void addEdge(ArrayList<ArrayList<Integer>> a, int source, int destination){
        a.get(source).add(destination);
        a.get(destination).add(source);
    }


    static boolean isCycle(ArrayList<ArrayList<Integer>> adj, int source, int v){

        boolean visited[] = new boolean[v];

        // for loop, if 2 or multiple disconnected graphs
        for(int i = 0; i<v; i++ ){
            if(!visited[i]){
                if(DFS_isCycle(i, adj, visited, v, -1)){
                    return true;    //i.e. cycle present, once DFS called, then everything is performed in DFS recursively and true will be return from deep down to all over to the up.
                }
            }
        }
        return false;
    }

    static boolean DFS_isCycle ( int S, ArrayList<ArrayList<Integer>> adj, boolean[] visited, int v, int parent ){      //s = Source (initial vertex),  v = no. of vertex
        visited[S] = true;
        System.out.println(S);
        // going through all neighbours of source in one iteration and calling for dfs for every item

        // for(Integer neighbour: adj.get(v)){
        for(int i = 0; i < adj.get(S).size(); i++){
            int neighbour = adj.get(S).get(i);

            // by default false if the next after this if statement executed then only returned true to this, and to all other to top level
            if( visited[neighbour] == false ){
                if ( DFS_isCycle( neighbour, adj, visited, v, S )){
                    // System.out.println(neighbour);
                    return true;
                }
            }
            // only if this return true, only then returned true all over to the above.
            // whenever executed no further nodes are traversed
            else if( neighbour != parent ){
                return true;
            }
        }

        return false;
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
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);


        // printing
        System.out.println(isCycle(adj, 0, v));

    }

}