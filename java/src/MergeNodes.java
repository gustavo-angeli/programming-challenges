import DataStructures.ListNode;

public class MergeNodes {
    public ListNode mergeNodes(ListNode head) {
        ListNode tempHead = head.next;
        ListNode newHead = new ListNode(0), tempNewHead = newHead;

        while (tempHead != null) {
            if (tempHead.val == 0 && tempHead.next != null) {
                tempNewHead.next = new ListNode(0);
                tempNewHead = tempNewHead.next;
            }
            tempNewHead.val += tempHead.val;
            tempHead = tempHead.next;
        }
        return newHead;
    }
}
