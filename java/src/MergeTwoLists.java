import DataStructures.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        } else if (list1 == null && list2 == null) {
            return null;
        }

        ListNode temp = list1;
        List<Integer> values = new ArrayList<>();

        while (temp != null) {
            values.add(temp.val);
            temp = temp.next;
        }

        temp = list2;

        while (temp != null) {
            values.add(temp.val);
            temp = temp.next;
        }

        Collections.sort(values);

        ListNode mergedList = new ListNode(values.get(0));
        temp = mergedList;

        for (int i = 1; i < values.size(); i++) {
            temp.next = new ListNode(values.get(i));
            temp = temp.next;
        }

        return mergedList;
    }
}
