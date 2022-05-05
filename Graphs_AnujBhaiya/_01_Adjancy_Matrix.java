package Graphs_AnujBhaiya;

class _01_Adjancy_Matrix{
    
    static void addEdge(int a[][], int source, int destination){

        a[source] [destination] = 1;
        a[destination] [source] = 1;

    }

    public static void main(String[] args){
        int v = 5;
        int e = 10;

        // creating matrix
        int a[][] = new int[v+1][v+1];  //+1 is to remove complications of -1

        // adding edges
        addEdge(a, 3, 5);
        addEdge(a, 5, 4);
        addEdge(a, 5, 1);
        addEdge(a, 4, 2);
        addEdge(a, 4, 1);
        addEdge(a, 1, 2);

        // printing
        for(int i =1; i <= v; i++){
            for(int j = 1; j <= v; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}