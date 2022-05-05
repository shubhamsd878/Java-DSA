package Linked_list;

public class _P01_search {
    protected int size = 0;

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
        
    Node head;

    void add(int data){
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

    void printList(){
        Node currNode = head;
        if(head == null){
            System.out.println("list is empty!");
        }
        while(currNode.next != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print(currNode.data + " -> ");            //IMPORTANT last node will not be printed in loop
        System.out.println("null");
    }
    void printSize(){
        System.out.println(size);
    }

    void search(int data){
        Node currNode = head;
        for(int i=0; i < size; i++){
            if( data == currNode.data){
                System.out.println(data + " is at index " + i);
            }
            currNode = currNode.next;
        }
    }

    public static void main(String[] args){
        _P01_search list = new _P01_search();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(1);

        list.printList();
        list.printSize();
        list.search(7);
    }
}