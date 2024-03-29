import DataStructures.ListNode;

public class GetDecimalValue {
    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        ListNode temp = head;

        while (temp != null) {
            sb.append(temp.val);
            temp = temp.next;
        }


        return Integer.parseInt(sb.toString(), 2);
    }
}
