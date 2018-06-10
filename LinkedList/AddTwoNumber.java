/*You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
*/


class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode head = new ListNode(0);
        ListNode cur = head;
        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            cur.next = new ListNode(0);
            cur = cur.next;
            if(l1 != null) {
                cur.val += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                cur.val += l2.val;
                l2 = l2.next;
            }
            cur.val += carry;
            carry = cur.val/10;
            cur.val = cur.val%10;
        }
        return head.next;
        
    }
}
