// push item at the bottom of the stack
// Important check how to traverse the stack
package Stacks;
import java.util.Stack;

public class _P01_IMP_push_at_bottom {

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
    public static void main(String args[]){
        Stack<Integer> stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        pushAtBottom(stack, 4);

        //popping upper three elements to check
        // stack.pop();
        // stack.pop();
        // stack.pop();
        // System.out.println(stack.pop());

        // IMPORTANT how to traverse stack
        while(!stack.isEmpty()){
           System.out.println(stack.pop());  // pop first returns value then remove
        }
    }
}
