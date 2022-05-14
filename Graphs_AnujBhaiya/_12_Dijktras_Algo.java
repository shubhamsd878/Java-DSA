// To find shortest path
package Graphs_AnujBhaiya;
import java.util.*;

// IIII
// class Node implements Comparator<Node>{
class Node {
    int data;
    int weight;

    Node(int _v, int _w){
        data = _v;
        weight = _w;
    }

    // without this the constructor is undefined
    Node(){

    }

    int getV () { return data; }
    int getW () { return weight; }

    // IIIII
    // @Override
    // public int compare(Node node1, Node node2){
    //     if (node1.weight < node2.weight){
    //         return -1;
    //     }
    //     if (node2.weight > node2.weight){
    //         return -1;
    //     }
    //     return 0;
    // }


}

class weightCompare implements Comparator<Node>{
    
    @Override
    public int compare(Node n1, Node n2){
        return n1.getW() - n2.getW();       //makes minimum priority queue;
        // return n2.weight - n1.weight;       //for maximum priority queue;
    }

} 

public class _12_Dijktras_Algo {
    
    static void shortestPath(int S, ArrayList<ArrayList<Node>> adj, int v ){
        
        int dist[] = new int[v];
        
        // dist to infinity
        for(int i = 0; i<v; i++)
        {    dist[i] = 100000000;  }

        dist[S] = 0;

        // weightCompare comparator = new weightCompare();
        // PriorityQueue<Node> pq = new PriorityQueue<Node>(v, new Node());
        // PriorityQueue<Node> pq = new PriorityQueue<Node>(v, comparator);
        PriorityQueue<Node> pq = new PriorityQueue<Node>(v, new weightCompare());
        
        // IIIIIII
        pq.add(new Node(S, 0));

        // Most important loop
        while(pq.size() > 0){
            Node newNode = pq.poll();

            for(int i = 0; i < adj.get(newNode.getV()).size(); i++){

                Node neighbour = adj.get(newNode.getV()).get(i);
                // System.out.println(newNode.getV());
                // System.out.println(neighbour.getV());
                // System.out.println(neighbour.getW());
                // // // System.out.println(dist[]);
                // System.out.println("Out: " + (neighbour.getW() + newNode.getW()));
                // System.out.println(neighbour.getW() + newNode.getW() < dist[neighbour.getV()]);

                // IMPORTANT dist[neighbour.getV()] --> getV because dist at V has weight

                // if(neighbour.getW() + newNode.getW() < dist[neighbour.getV()]){     <---  *** wrong *** 
                if(neighbour.getW() + dist[newNode.getV()] < dist[neighbour.getV()]){

                    dist[neighbour.getV()] = neighbour.getW() + newNode.getW();

                    pq.add(new Node(neighbour.getV(), dist[newNode.getV()]));
                }
                // for System.out.println(nei);
            }
        }

        for(int i = 0; i<v; i++){
            // System.out.println( "Minimum distance from " + S + " to " + i + " is -->" + dist[i]);
            System.out.println( "Minimum distance from " + (S+1) + " to " + (i+1) + " is -->" + dist[i]);
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

        adj.get(0).add(new Node(3, 1));
        adj.get(3).add(new Node(0, 1));

        adj.get(1).add(new Node(2, 4));
        adj.get(2).add(new Node(1, 4));

        adj.get(1).add(new Node(4, 5));
        adj.get(4).add(new Node(1, 5));

        adj.get(2).add(new Node(3, 3));
        adj.get(3).add(new Node(2, 3));

        adj.get(2).add(new Node(4, 1));
        adj.get(4).add(new Node(4, 1));

        adj.get(2).add(new Node(4, 5));
        adj.get(4).add(new Node(2, 5));


        // adj.get(2).add(new Node(4, 5));

        shortestPath(0, adj, v);
    }


}
