// package Linked_list;

// size is giving error of +1
public class LL {

    protected int size;
    LL(){
        size = 0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    void addFirst(String data){
        Node newNode = new Node(data);
        newNode.next = head;            //equals to head.next
        head = newNode;                 //newNode is now head

        size++;
    }
    
    void addLast(String data){
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

    void addInMiddle(int index, String data){
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
        while(currNode.next != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
            // size++;
        }
        System.out.println("null");
    }

    void printSize(){
        System.out.println(size);
    }

    public static void main(String[] args){
        LL list = new LL();                 //IMPORTANT

        list.addFirst("This");
        list.addLast("is");
        list.addLast("a");
        list.addLast("linked_list");
        list.addLast("program");
        
        list.printList();
        list.printSize();

        list.deleteLast();
        list.printList();
        list.printSize();

        list.deleteFirst();
        list.printList();
        list.printSize();  
        
        list.addFirst("This");
        list.addInMiddle(3, "Linked_list");
        list.printList();
        list.printSize();  
    }
}