import DataStructures.ListNode;

public class ReverseList {
    public static int nodeValue(ListNode head, int n) {
        ListNode temp = head;
        for (int i = 0; i < n - 1; i++) {
            temp = temp.next;
        }
        return temp.val;
    }
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        int size = 0;
        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
            size++;
        }
        size++;

        ListNode reverseHead = new ListNode(temp.val);
        temp = reverseHead;

        while (size > 0) {
            for (int i = 1; i < size; i++) {
                if (i == size - 1) {
                    temp.next = new ListNode(nodeValue(head, size - 1));
                    temp = temp.next;
                }
            }
            size--;
        }

        return reverseHead;
    }
}
