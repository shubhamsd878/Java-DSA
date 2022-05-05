// remember not to make functions inside class not static
// remember to make class static
package Queue;
    
public class _02_IMP_Circular_Queue_Array {
    static class Queue{
        public static int arr[];    //as we don't know the size
        public static int size;
        private static int rear = -1;       //rear = last index
        private static int front = -1;

        Queue(int n){
            arr = new int[n];   //arr doesn't have [],  declare size = n of array
            size = n;
        }

        public boolean isEmpty(){
            return rear == -1;
        }

        public boolean isFull(){
            return ((rear+1) % size == front);
        }

        // Enqueue
        public void add(int data){
            
            if( isFull() ){
                System.out.println("Queue is full! ");
                return;
            }
            
            if(front == -1){    //IMPORTANT
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // Dequeue
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty!");
                return -1;
            }

            else{
                int temp = arr[front];
                
                
                // front++;     //Wrong, front will never get 0 again
                arr[front] = 0;
                if(front == rear){
                    front = -1; rear = -1;
                }
                else{
                    front = (front + 1) % size;
                }

                return temp;
            }
        }

        // Front
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty! can't peek");
                return -1;
            }

            return arr[front];            
            // return arr[3];            
        }
    }

    public static void main(String[] args){
        Queue q = new Queue(5);     //Don't forget to give size of array while declaring with queue

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();

        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        q.remove();
        q.add(11);


        //Output must be 6 7 8

        // System.out.println(q.peek());

        // loop for trversing circular queue
        while(!q.isEmpty())             //run when isEmpty == false
            System.out.println(q.remove());
    }
}