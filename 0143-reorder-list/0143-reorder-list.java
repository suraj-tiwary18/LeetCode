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
    public void reorderList(ListNode head) {
        ListNode slow = head;

        while(slow != null && slow.next != null){

            ListNode fast = slow;

            while(fast.next.next != null){
                fast = fast.next;
            }

            ListNode last = fast.next;

            fast.next = null;

            last.next = slow.next;
            slow.next = last;

            slow = last.next;

        }
    }
}