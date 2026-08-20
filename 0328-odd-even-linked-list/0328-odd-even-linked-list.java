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
    public ListNode oddEvenList(ListNode head) {

        if(head == null || head.next == null)
        {
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenhead = even; 

        while(even != null && even.next != null)
        {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenhead;

        return head;
    /*  

        if (head == null || head.next == null) {
            return head;
        }

        ListNode temp = head;

        ArrayList<Integer> arr = new ArrayList<>();
        while(temp != null)
        {
            arr.add(temp.val);
            temp = temp.next;
        }

        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode evenIdx = dummy1;
        ListNode oddIdx = dummy2;

        int n = arr.size();

        for(int i = 0; i<=n-1; i++)
        {
            if(i % 2 == 0)
            {
                evenIdx.next = new ListNode(arr.get(i));
                evenIdx = evenIdx.next;
            }else
            {
               oddIdx.next  = new ListNode(arr.get(i));
               oddIdx = oddIdx.next;
            }
        }

        evenIdx.next = dummy2.next;
        oddIdx.next = null;

       return dummy1.next;


    */   
    }

}