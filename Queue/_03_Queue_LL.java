// use tailNode to traverse to last node directly instead of traversing to last node everytime during addition
package Queue;

public class _03_Queue_LL {
    static class Node{
        int data;
        Node next = null;
    }

    static class LL{ 
        Node head;
        Node tailNode;

        // isEmpty function
        public boolean isEmpty(){
            return head == null;
        }

        public void add(int data){
            Node newNode = new Node();
            newNode.data = data;

            if(isEmpty()){
                tailNode = head = newNode;
                // tailNode = head;
                return;
            }

            tailNode.next = newNode;
            
            tailNode = newNode;       
            
        }

        public int peek(){
            if( isEmpty() ){
                System.out.println("list is empty");
                return -1;    
            }

            return head.data;
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("list is empty");
                return -1;  
            }

            int temp = head.data;
            head = head.next;

            return temp;
        }

    }
    public static void main(String[] args){
        LL list = new LL();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //output : 1 2 3

        list.remove();
        list.remove();
        list.remove();
        list.remove();

        list.add(5);
        list.add(6);
        list.add(7);

        // list.remove();
        // list.remove();
        // list.remove();


        // System.out.println(list.peek());

        while(!list.isEmpty())
            System.out.println(list.remove());
    }
    
}
