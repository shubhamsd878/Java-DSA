package Reverse_Iterative_Recursive;

// size is giving error of +1
public class _P06_delete_nth_node_from_last {

    protected int size;
    _P06_delete_nth_node_from_last(){
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

    void deleteNodeFromLast(Node head, int n){
        Node prevNode = head;
        Node currNode = head.next;
        Node nextNode = currNode.next;
        int i =1;                       //i start from 1, as size is +1 of index
        while(i != (size - n)){
            prevNode = prevNode.next;
            currNode = currNode.next;
            nextNode = nextNode.next;
            
            i++;
        }
        //as currNode is now node to delete
        if(nextNode == null){
            prevNode.next = null;
        }
        prevNode.next = nextNode;
        
        System.out.println("   Node delted successfully   ");
        size--;
    }


    
    public static void main(String[] args){
        _P06_delete_nth_node_from_last list = new _P06_delete_nth_node_from_last();                 //IMPORTANT
        
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        list.printList();
        list.printSize();
        
        
        //list.head = list.reverseRecursive(list.head);       //IMPORTANT
        // list.swapPairs(list.head);
        list.printList();
        // int n=2;
        list.deleteNodeFromLast(list.head, 2);
        list.printList();
        list.printSize();

    }
}
