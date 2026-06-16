class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int length = 0;
        ListNode curr = head;

        while (curr != null) {
            length++;
            curr = curr.next;
        }

        int target = length - n;

        if (target == 0) {
            return head.next;
        }

        curr = head;
        int index = 1;

        while (index < target) {
            curr = curr.next;
            index++;
        }

        curr.next = curr.next.next;

        return head;
    }
}
