import DataStructures.ListNode;

public class ReverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            if (temp.val == k) {
                temp.val = temp.next.val;
                temp.next.val = k;
            }
        }
        return head;
    }
}
