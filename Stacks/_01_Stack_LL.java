// Stack by LinkedList
package Stacks;

public class _01_Stack_LL {
    static class Node{
        
        public int data ;
        public Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack{
        public static Node head;

        public static boolean isEmpty(){
            return head == null;    //returns boolean
        }

        public void push(int data){
            
            Node newNode = new Node(data);

            // System.out.println("condition: ");
            if(isEmpty()){
                System.out.println("Stack is empty from push, addiding first node");
                head = newNode;
                // head.data = data; 
                return;
            }

            else{
                newNode.next = head;
                head = newNode; 

                // head.next = head;
                // head.data = data;
            }
        }

        public void peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return;
            }
            System.out.println(head.data);
        }

        public void pop(){
            if(isEmpty()){
                System.out.println("Stack underflow! Cannot pop");
                return;
            }
            
            else{
                head = head.next;
            }
        }
    }

    public static void main(String[] args){
       
        Stack list = new Stack();

        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);

        list.pop();
        list.peek();
    }

}
