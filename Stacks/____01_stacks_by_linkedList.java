// Don't understand how isEmpty is working
package Stacks;

class ____01_stacks_by_linkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    static class Stack{
        Node head;

        public boolean isEmpty(){
            return (head == null);
        }

        void push(int data){
            if(isEmpty()){
                // head = newNode;
                head.data = data;
                return;
            }

            // newNode.data = data;
            // newNode.next = head;
            head.next = head;
            head.data = data;
        }

        int pop(){
            if(isEmpty()){
                return -1;
            }
            Node top = head;
            head = head.next;
            return top.data;
        }

        int peek(){

            return head.data;
        }
        
    }

    public static void main(String[] args){
        Stack st1 = new Stack();
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
        st1.push(5);

        while(!(st1.isEmpty())){
            System.out.println(st1.peek());
            st1.pop();
        }
    }
}