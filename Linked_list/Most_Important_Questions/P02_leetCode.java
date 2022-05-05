/*                                only code to be used on leetcode
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return head;
        }
        if(head.next == null){
            if(n == 1){
                head = null;
            }
            return head;
        }
              
        
        ListNode prevNode = head;
        ListNode currNode = head.next;   
        
        int sz=0;
        ListNode sizeNode = head;
        
        while(sizeNode!=null){
            sizeNode = sizeNode.next;
            sz++;
        }
        int i =1;                       //i start from 1, as size is +1 of index
        
        if(sz != n){
            while(i != (sz - n)){

                prevNode = prevNode.next;
                if(currNode.next == null)
                    break;
                currNode = currNode.next;

                i++;
            }

        if(currNode.next == null){
            prevNode.next = null;
            sz--;
            return head;
        }
        
        else{
        prevNode.next = currNode.next;
        }
        sz--; 
        return head;
    }
}
}