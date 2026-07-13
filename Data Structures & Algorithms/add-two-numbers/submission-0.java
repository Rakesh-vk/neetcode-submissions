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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // take a dummy node
        // get data from l1 and l2
        // add them
        // add last digit to node
        // get carry
        // if l1!=null assign it to dummy list
        // if l2!=null assign it to dummy list
        // return dummy.next;
       ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            // get val if node is resent else 0
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            // sum
            int sum = x + y + carry;

            carry = sum / 10;
            int digit = sum % 10;
            // add node at the end of dummy
            curr.next = new ListNode(digit);
            curr = curr.next;
            // connect remaining list to resulting list
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return dummy.next;
    }
}