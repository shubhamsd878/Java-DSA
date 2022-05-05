// push at bottom also used
package Stacks;

import java.util.Stack;

public class _P02_MOST_IMP_reverse_a_stack {
    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.size() == 0){
            s.push(data);
            return ;
        }
        
        int temp = s.peek();
        s.pop();
        pushAtBottom(s, data);
        s.push(temp);

    }

    public static void reverseStack(Stack<Integer> s){
        if(s.size() == 0){
            System.out.println("stack underflow! cannot reverse");
            return ;
        }    
        
        int temp = s.pop();
        reverseStack(s);
        pushAtBottom(s, temp);
    }

    public static void main(String args[]){
        Stack<Integer> stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        reverseStack(stack);

        while(!stack.isEmpty()){
           System.out.println(stack.pop());  // pop first returns value then remove
        }
    }
}