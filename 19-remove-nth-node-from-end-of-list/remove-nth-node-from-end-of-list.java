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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count = 0;

        if(head==null || head.next==null || n==0) return null;

        while(temp!=null){
            count++;
            temp=temp.next;
        }

        if(n==count){
            return head.next;
        }

        ListNode temp2 = head;

        if(n<=count) {
            n = count-n;
            for(int i=0;i<n-1;i++){
                temp2=temp2.next;
            }
            temp2.next=temp2.next.next;
        }

    
            return head;

    }
}