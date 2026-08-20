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
        
        ListNode i = head;
        ListNode dummy = new ListNode(-1);       
        ListNode k = dummy;                     

        while(i != null && i.next != null)       
        {
            ListNode j = i.next;
            ListNode nextPair = j.next;

            k.next = j;
            j.next = i;

           k = i;
           i = nextPair;
        }
        k.next = i;

        return dummy.next;
    }
}