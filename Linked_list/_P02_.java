// Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.
package Linked_list;
import java.util.*;
public class _P02_ {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
        Node head;

        void add(int data){
            Node newNode = new Node(data);
            if( head == null){
                head = newNode;
                return;
            }

            Node currNode = head;
            while(currNode.next != null){
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }

        void printList(){
            Node currNode = head;
            while(currNode != null){
                System.out.print(currNode.data + " -> ");
                currNode = currNode.next;
            }
            System.out.println("null");
        }

        

        void delUnder25(){
            Node currNode = head;
            Node nextNode = currNode.next;
            //deletion
            while(nextNode != null){
                if(nextNode.data < 25){
                    currNode.next = nextNode.next;
                }
                currNode = currNode.next;
                nextNode = nextNode.next;
            }
        }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        _P02_ list = new _P02_();                           //IMPORTANT
        System.out.println("Enter size of linked list: ");
        int size = sc.nextInt();

        System.out.println("Enter list items: ");
        for(int i=0; i<size; i++){
            int data = sc.nextInt();
            list.add(data);            
        }
        
        list.delUnder25();
        list.printList();
    }
    
}