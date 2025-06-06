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
    public ListNode deleteMiddle(ListNode head) {
        
        // 1. If the list is empty
        if(head==null || head.next==null){
            return null;
        }

        // 2. If the List has 2 nodes : Delete the second one
        
        ListNode slow=head;
        ListNode fast=head;
        if(fast.next.next!=null){
            fast=fast.next.next;
        } else {
            slow.next=null;
            return slow;
        }

        //3. If list has three or more than three nodes

        while(fast!=null && fast.next!=null){
            
            fast=fast.next.next;
            slow=slow.next;
        }
        
        if(slow!=null){
            slow.next=slow.next.next;
        }
           
        return head;

    }
}