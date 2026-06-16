class Solution {
    public boolean isPalindrome(ListNode head) {

        List<Integer> values = new ArrayList<>();

        ListNode curr = head;

        while (curr != null) {
            values.add(curr.val);
            curr = curr.next;
        }

        int left = 0;
        int right = values.size() - 1;

        while (left < right) {

            if (!values.get(left).equals(values.get(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
