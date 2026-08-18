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

    public int getLength(ListNode head) {
        int length = 0;

        while (head != null) {
            length++;
            head = head.next;
        }

        return length;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int sizeA = getLength(headA);
        int sizeB = getLength(headB);

        ListNode t1 = headA;
        ListNode t2 = headB;

        if (sizeA > sizeB) {
            for (int i = 0; i < sizeA - sizeB; i++) {
                t1 = t1.next;
            }
        } else {
            for (int i = 0; i < sizeB - sizeA; i++) {
                t2 = t2.next;
            }
        }

        while (t1 != t2) {
            t1 = t1.next;
            t2 = t2.next;
        }

        return t1;
    }
}