// Q. Queue using two stacks
// important add algorithm
package Queue;
import java.util.Stack;

public class _P01_IMP_Queue_using_two_stacks {
    static class Queue{
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        boolean isEmpty(){
            return s1.isEmpty();
        }

        public void add(int data){
            if(s1.isEmpty()){
                s1.add(data);
                return;
            }

            while( !s1.isEmpty()){
                s2.push(s1.pop());      // jo s1 sy pop hoga vo s2 m add hota rhega
            }

            s1.push(data);

            while( !s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        public int remove(){
            return s1.pop();
        }

        public int peek(){
            return s1.peek();
        }
    }
    public static void main(String[] args){
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        // output: 1 2 3 4
        while(!q.isEmpty())
        System.out.println(q.remove());
    }
}
