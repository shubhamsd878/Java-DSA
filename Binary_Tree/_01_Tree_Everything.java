// BuildTree(preOrder) + Traversal (preOrder + inOrder + postOrder + levelOrder) + Q.( countNodes + sumNodes + diameter( 2 approches))  
// Most important levelOrder
package Binary_Tree;

import java.util.Queue;
import java.util.LinkedList;

public class _01_Tree_Everything{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Build Tree preOrder
    static class BinaryTree{
        static int idx = -1;

        public static Node buildTree(int arr[]){    //return root Node
            idx++;
            if(arr[idx] == -1){
                return null;
            }

            Node newNode = new Node(arr[idx]);
            newNode.left = buildTree(arr);
            newNode.right = buildTree(arr);

            return newNode;         //as this will last node in recursion, so returns head node. 
        }

    }

    // print Tree preOrder
    public static void preOrder(Node root){
        // if(root.data == -1)                  //Common mistake
        if(root == null ){
            // System.out.print("-1 ");            //In case you want to print -1 instead of nothing 
            return;
        }
        
        System.out.print(root.data + " ");          //1st print root Node data
        preOrder(root.left);
        preOrder(root.right);
    }

    // print Tree inOrder
    public static void inOrder(Node root){
        // if(root.data == -1)                  //Common mistake
        if(root == null ){
            // System.out.print("-1 ");            //In case you want to print -1 instead of nothing 
            return;
        }
        
        inOrder(root.left);
        System.out.print(root.data + " ");          //1st print root Node data
        inOrder(root.right);
    }

    // print Tree postOrder
    public static void postOrder(Node root){
        // if(root.data == -1)                  //Common mistake
        if(root == null ){
            // System.out.print("-1 ");            //In case you want to print -1 instead of nothing 
            return;
        }
        
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");          //1st print root Node data
    }

    // levelOrder print Tree
    //Must Dry run. 
    public static void levelOrder(Node root){
        if(root == null){       // if q == empty, then nothing to print
            return;
        }
        
        Queue<Node> q = new LinkedList<>();
        
        q.add(root);
        q.add(null);        //as only can have one root level element and have to \n

        while(!q.isEmpty()){
            Node currNode = q.remove();     //currNode = removed node 

            if(currNode == null){
                System.out.println();
                
                if(!q.isEmpty()){           //when curr == null, add null
                    q.add(null);
                }
            }

            else{
                System.out.print(currNode.data + " ");

                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }


    // Q.1 count of Nodes
    public static int countOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftNode = countOfNodes(root.left);
        int rightNode = countOfNodes(root.right);

        return leftNode + rightNode + 1;
    }
    

    // Q.2 sum of nodes
    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftNodeSum = sumOfNodes(root.left);
        int rightNodeSum = sumOfNodes(root.right);

        // return root.data + sum;
        return leftNodeSum + rightNodeSum + root.data;
    }


    // Q.3 heightOfNodes of nodes
    public static int heightOfNodes(Node root){     // result will be maxHeight
        if(root == null){
            return 0;
        }

        int leftHeight = heightOfNodes(root.left);
        int rightHeight = heightOfNodes(root.right);

        return Math.max(leftHeight, rightHeight) + 1;   //+1 for root node itself
    }


    // Q.4 diameter Approach 1  O(n^2)
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int Diam1 = diameter(root.left);
        int Diam2 = diameter(root.right);
        int Diam_3 = heightOfNodes(root.left) + heightOfNodes(root.right) + 1;      //IMPORTANT
        // int Diam_3 = Diam1 + Diam2 + 1;
        
        return Math.max(Diam1, Math.max(Diam2, Diam_3));
    }


    public static void main(String[] args){
        int arr[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        // int arr[] = {1, 2, 3, 4, 5, 6, -1, -1, -1, 7, -1, 8};        //not working dry run

        BinaryTree b = new BinaryTree();

        // BuildTree get root
        Node root = b.buildTree(arr);

        // Traversals
        // preOrder(root);       
        // inOrder(root);       
        // postOrder(root);       
        levelOrder(root); 
        
        // IMPORTANT Questions
        // Q.1 count of Nodes
        // System.out.println(countOfNodes(root));
        
        // Q.2 sum of Nodes
        // System.out.println(sumOfNodes(root));

        // Q.3 Height of Nodes
        // System.out.println(heightOfNodes(root));

        // Q.4 Diameter of Tree: Approach 1
        System.out.println(diameter(root));

    }
}