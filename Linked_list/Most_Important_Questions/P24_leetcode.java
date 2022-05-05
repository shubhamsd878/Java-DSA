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
    ListNode mid(ListNode head){
        ListNode tortoise = head;
        ListNode hare = head;
        while(hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            tortoise = tortoise.next;
        }
        return tortoise;
    }
    
    ListNode rev(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode curr = head;
        ListNode mid = mid(head);
        
        ListNode rev = rev(mid.next);
        
        while(rev != null){
            if(curr.val != rev.val){
                return false;
            }
            curr = curr.next;
            rev = rev.next;
        }
        return true;
    }
}
