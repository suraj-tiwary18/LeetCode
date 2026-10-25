class Solution {

    public void reverse(ListNode head, int times) {
        ListNode curr = head;
        ListNode prev = null;

        while (times > 0) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            times--;
        }
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode left = head;
        ListNode right;
        ListNode res = null;
        ListNode prevleft = null;
        int size = 2;

        while (true) {
            right = left;

            for (int i = 0; i < size - 1; i++) {
                if (right == null || right.next == null) {
                    break;
                }
                right = right.next;
            }

            if (right == null || right == left) {
                break;
            }

            if (right.next == null && right == left) {
                break;
            }

            ListNode nextleft = right.next;

            reverse(left, size);

            if (prevleft != null) {
                prevleft.next = right;
            }

            if (res == null) {
                res = right;
            }

            prevleft = left;
            left = nextleft;

            if (left == null) {
                break;
            }

            if (left.next == null) {
                break;
            }
        }

        if (prevleft != null) {
            prevleft.next = left;
        }

        return res == null ? head : res;
    }

}
