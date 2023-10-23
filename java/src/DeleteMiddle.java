import DataStructures.ListNode;

public class DeleteMiddle {
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        int count = 0;

        while (temp != null) {
            temp = temp.next;
            count++;
        }

        if (count == 1) {
            return null;
        }

        count = (int) (Math.ceil(count / 2));
        temp = head;

        for (int i = 0; i < count; i++) {
            if (i == count - 1) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return head;
    }
}
