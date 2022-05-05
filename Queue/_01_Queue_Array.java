// remember not to make functions inside class not static
// remember to make class static
package Queue;

public class _01_Queue_Array {
    static class Queue{
        public static int arr[];    //as we don't know the size
        public static int size;
        private static int rear = -1;       //rear = last index
        // no need to declare front as arr[0] is always front

        Queue(int n){
            arr = new int[n];   //arr doesn't have [],  declare size = n of array
            this.size = n;
        }

        public boolean isEmpty(){
            return rear == -1;
        }

        // Enqueue
        public void add(int data){
            if(rear == size){
                System.out.println("Queue is full! ");
                return;
            }
            
            else{
                rear++;
                arr[rear] = data;
            }
        }

        // Front
        public int peek(){
            if(rear == -1){
                System.out.println("Queue is empty! can't peek");
                return -1;
            }
            return arr[0];            
        }

        // Dequeue
        public int remove(){
            if(rear == -1){
                System.out.println("Queue is empty!");
                return -1;
            }

            else{
                int temp = arr[0];

                for(int i=0; i<rear; i++){     //rear = last index
                    arr[i] = arr[i+1];
                }    

                rear--;

                return temp;
            }
        }

    }

    public static void main(String[] args){
        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);

        //1 2 3
        // while(!(q.peek() == 0))
        while(!q.isEmpty())             //run when isEmpty == false
            System.out.println(q.remove());
    }
}