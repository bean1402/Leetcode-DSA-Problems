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
        // 1. Handle base cases: If the list is empty or has only one node, return null (nothing to delete). \U0001f645‍♀️
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head; // Slow pointer: Moves one step at a time. \U0001f6b6
        ListNode fast = head; // Fast pointer: Moves two steps at a time. \U0001f3c3

        // 2. Special case: If the list has only two nodes, delete the second one.
        if (fast.next.next != null) { // Check if there's a third node (meaning more than 2 nodes).
            fast = fast.next.next; // Move fast two steps ahead.
        } else {
            slow.next = null; 
            return slow; 
        }

        // 3. General case: The list has three or more nodes.
        while (fast != null && fast.next != null) {
            fast = fast.next.next; // Move fast two steps ahead.
            slow = slow.next; // Move slow one step ahead.
        }

        // 4. Now, 'slow' points to the node BEFORE the middle node. Delete the middle node.
        if (slow != null) { // Make sure slow is not null (shouldn't happen, but good to check).
            slow.next = slow.next.next; // Remove the middle node by skipping it.
        }

        return head; // Return the (potentially modified) head of the list.
    }
}