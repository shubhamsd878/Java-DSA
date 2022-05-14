// IMPORTANT lines to check in comparison to unidirected are  --->  34,  51,  56

package Graphs_AnujBhaiya;
import java.util.*;


public class _08_TopoSort_DFS_Directed {
    static void addEdge(ArrayList<ArrayList<Integer>> a, int source, int destination){
        a.get(source).add(destination);
        // destination to source not required as this is directed graph
        // a.get(destination).add(source);      
    }


    static void findTopoSort(ArrayList<ArrayList<Integer>> adj, int source, int v){

        boolean visited[] = new boolean[v];
        Stack<Integer> st = new Stack<Integer>(); 

        // for loop, if 2 or multiple disconnected graphs
        for(int i = 0; i<v; i++ ){
            if(!visited[i]){
                topoSort(i, adj, visited, st);
            }
        }

        // printing
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }

    }

    static void topoSort(int S, ArrayList<ArrayList<Integer>> adj, boolean[] visited, Stack<Integer> st){
        visited[S] = true;

        for(int i =0 ; i < adj.get(S).size(); i++){

            int neighbour = adj.get(S).get(i);
            
            if(visited[neighbour] == false)
                topoSort( neighbour, adj, visited, st);

        }

        st.push(S);
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
        findTopoSort(adj, 0, v);

    }

}