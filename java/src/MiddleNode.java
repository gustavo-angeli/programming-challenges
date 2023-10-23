import DataStructures.ListNode;

public class MiddleNode {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int count = 0;

        while (temp != null) {
            temp = temp.next;
            count++;
        }

        count = (int) (Math.ceil(count / 2));

        for (int i = 0; i < count; i++) {
            head = head.next;
        }

        return head;
    }
}
