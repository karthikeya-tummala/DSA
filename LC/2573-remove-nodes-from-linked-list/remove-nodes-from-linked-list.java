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
    public ListNode removeNodes(ListNode head) {
        head = reverse(head);

        int max = head.val;
        ListNode curr = head.next, prev = head;

        while (curr != null) {
            if (curr.val < max) {
                prev.next = curr.next;
            }
            else {
                max = curr.val;
                prev = curr;
            }
            curr = curr.next;
        }
        return reverse(head);
    }
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}