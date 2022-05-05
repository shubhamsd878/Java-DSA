// Stack by Java Collection Framwork
// IMORTANT collection framework returns value
package Stacks;
import java.util.Stack;

public class _03_Stack_JCF {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.pop();

        System.out.println(stack.peek());

    }
}
