package Reverse_Iterative_Recursive;

// size is giving error of +1
public class P02 {

    protected int size;
    P02(){
        size = 0;
    }

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;            //equals to head.next
        head = newNode;                 //newNode is now head

        size++;
    }
    
    void addLast(int data){
        Node newNode = new Node(data);
        
        if(head == null){
            head = newNode;
            size++;
            return;
        }

        Node lastNode = head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;

        size++;
    }

    void deleteFirst(){
        head = head.next;
        
        size--;
    }

    void deleteLast(){
        if(head == null){
            System.out.println("List is empty!");
            size--;
            return;
        }

        if(head.next == null){
            head = null;
            size--;
            return;
        }

        Node currNode = head;
        Node lastNode = head.next;

        while(lastNode.next != null){
            lastNode = lastNode.next;
            currNode = currNode.next;
        }

        currNode.next = null;
        
        size--;
    }

    void addInMiddle(int index, int data){
        Node newNode = new Node(data);

        if(index < 0 || index > size){
            System.out.println("invalid index !");
            return;
        }

        if(index == 0 || head == null){
            newNode.next = head;
            head = newNode;
            return;
        }

        Node currNode = head;
        for( int i =1; i < size; i++){
            if(i == index){
                Node nextNode = currNode.next;
                currNode.next = newNode;
                newNode.next = nextNode;
            }

            currNode=currNode.next;
        }
    }

    void printList(){
        Node currNode = head;
        if(head == null){
            System.out.println("list is empty!");
            return;
        }
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
            // size++;
        }
        System.out.println("null");
    }

    void printSize(){
        System.out.println(size);
    }
    
    //self
    void revList(){
        if(head == null || head.next == null){
            return;
        }

        Node currNode = head;
        head = null;
        Node prevNode = head;
        for(int i = 0; i < this.size; i++){
            Node nextNode = currNode.next;
            
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head = prevNode;
    }

    void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        
        while(currNode != null){
            Node nextNode = currNode.next;

            currNode.next = prevNode;
            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;            //IMPORTANT    without this line: infinity loop
        head = prevNode;        // as currNode is now null
    }

    Node reverseRecursive(Node head){               //IMPORANT return Node
        if(head == null || head.next == null){
            return head;
        }

        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public void swapPairs(Node head) {
        if(head == null || head.next == null){
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        head = currNode;
        Node nextNode = currNode.next;
        while(currNode.next != null){

            currNode.next = prevNode;
            prevNode.next = nextNode.next;

            //update
            currNode = prevNode.next;
            prevNode = nextNode;
            nextNode = currNode.next;
            currNode.next = prevNode;
        }
    }

    /*public void swapPairs(Node head) {
        if(head == null || head.next == null){
            return;
        }
        
        Node currNode = head.next;
        Node prevNode = head;
        prevNode.next = currNode;
        head.next = null;
        int i = 0;
        while(prevNode != null){            //prevNode is as currNode according to algorithm
            Node nextNode = prevNode.next;

            currNode.next = prevNode;
            prevNode.next = 
            //swap
            Node tempNode = currNode;   //temp Node
            currNode = prevNode;
            prevNode = tempNode;



            if(i == 0){
                head = currNode;
                i++;
            }
            
            prevNode = nextNode;
            // prevNode.next = nextNode;
            // prevNode.next = prevNode;
            // prevNode.next = nextNode;
            //update
            // prevNode = nextNode;
            // currNode = nextNode.next;
        }
        head = currNode;
    }*/
    public static void main(String[] args){
        P02 list = new P02();                 //IMPORTANT
        
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        list.printList();
        list.printSize();

       
        //list.head = list.reverseRecursive(list.head);       //IMPORTANT
        list.swapPairs(list.head);
        list.printList();

    }
}