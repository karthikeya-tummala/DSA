/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        int lenA = 0, lenB = 0;
        ListNode tailA = headA, tailB = headB;
        while (tailA.next != null) {
            lenA++;
            tailA = tailA.next;
        }

        while (tailB.next != null) {
            lenB++;
            tailB = tailB.next;
        }

        if (tailA != tailB) return null;

        ListNode ptrA = headA;
        ListNode ptrB = headB;

        if (lenA > lenB) {
            int diff = lenA - lenB;
            while (diff-- > 0) ptrA = ptrA.next;
        } else {
            int diff = lenB - lenA;
            while (diff-- > 0) ptrB = ptrB.next;
        }

        while (ptrA != ptrB) {
            ptrA = ptrA.next;
            ptrB = ptrB.next;
        }
        return ptrA;
    }
}