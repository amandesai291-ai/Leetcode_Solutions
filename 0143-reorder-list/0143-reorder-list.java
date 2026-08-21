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

    public ListNode reverse(ListNode head2)
    {
        ListNode pre = null;
        ListNode curr = head2;
        ListNode fwd = null;

         while(curr != null)
        {
            fwd = curr.next;
            curr.next = pre;
            pre = curr;
            curr = fwd;
        }

        return pre;
    } 

    public void reorderList(ListNode head) {
        
        ListNode slow = head;
        ListNode fast  = head;
        ListNode head2 = null;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        head2 = slow.next;
        slow.next = null;

        head2 = reverse(head2);

        ListNode temp = head;
                                      
        while (head2 != null) {  

            ListNode firstNext = temp.next;
            ListNode secondNext = head2.next;

            temp.next = head2;
            head2.next = firstNext;

            temp = firstNext;
            head2 = secondNext;
        }
    }
}