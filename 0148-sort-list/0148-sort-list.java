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
    public ListNode sortList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        if(head == null || head.next == null){
            return head;
        }

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secHalf = slow.next;
        slow.next = null;

        ListNode firstHalf = sortList(head);
        secHalf = sortList(secHalf);

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(firstHalf != null && secHalf != null){

            if(firstHalf.val <= secHalf.val){
                curr.next = firstHalf;
                firstHalf = firstHalf.next;
            } else {
                curr.next = secHalf;
                secHalf = secHalf.next;
            }

            curr = curr.next;
        }

        if(firstHalf != null){
            curr.next = firstHalf;
        } else {
            curr.next = secHalf;
        }

        return dummy.next;
    }
}