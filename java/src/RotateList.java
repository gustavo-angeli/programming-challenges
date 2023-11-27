import DataStructures.ListNode;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        int count = 0;

        while (temp != null) {
            temp = temp.next;
            count++;
        }

        k = k % count;

        if (k == 0) {
            return head;
        }

        temp = head;
        count = 0;
        while (temp != null) {
            count++;
            if (count >= k) {

            }
            temp = temp.next;
        }
        return null;
    }
}
