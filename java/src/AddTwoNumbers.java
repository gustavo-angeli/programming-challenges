import DataStructures.ListNode;

import java.math.BigInteger;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder sb = new StringBuilder();

        while (l1 != null) {
            sb.append(l1.val);
            l1 = l1.next;
        }

        BigInteger number = new BigInteger(sb.reverse().toString());

        sb.setLength(0);

        while (l2 != null) {
            sb.append(l2.val);
            l2 = l2.next;
        }

        number = number.add(new BigInteger(sb.reverse().toString()));

        sb.setLength(0);
        sb.append(number).reverse();

        ListNode numbers = new ListNode(Integer.parseInt(String.valueOf(sb.charAt(0)))), head = numbers;

        for (int i = 1; i < sb.length(); i++) {
            head.next = new ListNode(Integer.parseInt(String.valueOf(sb.charAt(i))));
            head = head.next;
        }

        return numbers;
    }
}
