import java.util.ArrayList;

class Solution
  {
    public ListNode middleNode(ListNode head)
    {
        ArrayList<ListNode> nodes = new ArrayList<>();
        ListNode current = head;

        while (current != null) {
            nodes.add(current);
            current = current.next;
        }

        int middleIndex = nodes.size() / 2;
        return nodes.get(middleIndex);
    }
}
