// package Most_Important_;

// size is giving error of +1
public class temp_reverse_between {

    protected int size;
 temp_reverse_between(){
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

  /*  public void reverseBetween(Node head, int left, int right) {      //works perfectly
        
        if(head == null || head.next == null){
            return;
        }
        
        int sz = 0;
        Node curr = head;
        while(curr!= null){
            curr=curr.next;
            sz++;
        }
        
        if(left == (sz - right + 1)){
            return;
        }
        
        Node firstNode = head;
        int i=1;
        while(i < (left - 1) ){
            firstNode = firstNode.next;
            i++;
        }
        
        // Node revHead= firstNode.next;

        Node lastNode = head;
        i = 0;
        while(i < (sz - right + 1) ){
            lastNode = lastNode.next;
            i++;
        }
        int n = (sz - right + 1) - left + 1;
        
        System.out.println("first Node data: " + firstNode.data);
        System.out.println("Last Node data: " + lastNode.data);
        System.out.println("no. of nodes to reverese: " + n);
        // firstNode.next = rev( revHead, lastNode, n);
        // return head;
    } */

    public Node rev(Node revHead, Node lastNode, int n){

        Node prev = null;
        Node curr = revHead;

        for(int i=0; i<3; i++){
        // while(curr!= null){
            Node next = curr.next;
            
            if(i ==0 ){
                curr.next = lastNode;
            }
            if(i != 0){
                curr.next = prev;
            }
                //update
            prev = curr;
            curr = next;
        }
        // revHead.next = lastNode;
        return prev;
    
    }
    public Node reverseBetween(Node head, int left, int right) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        int sz = 0;
        Node curr = head;
        while(curr!= null){
            curr=curr.next;
            sz++;
        }
        
        if(left == (sz - right + 1)){
            return head;
        }
        
        Node firstNode = head;
        int i=1;
        while(i<(left - 1)){
            firstNode = firstNode.next;
            i++;
        }
        
        Node revHead= firstNode.next;

        Node lastNode = head;
        i = 0;
        while(i < (sz - right + 1)){
            lastNode = lastNode.next;
            i++;
        }
        
        int n = (sz - right + 1) - left + 1;
        
        firstNode.next = this.rev( revHead, lastNode, n);
        return head;
    }

    public static void main(String[] args){
     temp_reverse_between list = new temp_reverse_between();                 //IMPORTANT

        list.addFirst("This");
        list.addLast("is");
        list.addLast("a");
        list.addLast("linked_list");
        list.addLast("program");
        
        list.printList();
        list.printSize();
        list.reverseBetween(list.head, 2, 2);
        list.printList();

    }
}