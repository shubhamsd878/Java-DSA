// Stack by ArrayList
package Stacks;

import java.util.ArrayList;

public class _02_Stack_AL {
    static class Stack{
        ArrayList<Integer> list = new ArrayList<>();

        public void push(int data){
            list.add(data);
            System.out.println("item successfully pushed");
        }
        
        
        public void pop(){
            if(list.isEmpty()){
                System.out.println("Stack underflow! cannot pop");
                return;
            }

            int topIndex = list.size() - 1;
            list.remove(topIndex);
            System.out.println("item successfully popped");
        }

        public void peek(){
            if(list.isEmpty()){
                System.out.println("Stack underflow! cannot pop");
                return;
            }

            int topIndex = list.size() - 1;
            System.out.println( list.get(topIndex)); 
        }
    }

    public static void main(String [] args){
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.pop();

        stack.peek();
    }
}
