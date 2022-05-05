/**
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
    public ListNode swapPairs(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode lhead = null;

        head = curr;
        
        int i=0;        //for if statement
        while(prev != null && curr != null){
            ListNode next = curr.next;
            
            //swapping adjacent values
            if(i>0){
                lhead.next = curr;
            }
            i++;

            curr.next = prev;
            
            prev.next = next;
            if(next == null){
                break;
            }
            lhead = prev;
            prev = next;
            curr=prev.next;
        }
        return head;
    }
}