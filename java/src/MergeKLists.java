import DataStructures.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null) {
            return null;
        }

        List<Integer> numbers = new ArrayList<>();

        if (lists.length > 0) {
            for (int i = 0; i < lists.length; i++) {
                ListNode head = lists[i];
                if (head != null) {
                    while (head != null) {
                        numbers.add(head.val);
                        head = head.next;
                    }
                }
            }
        }

        if (numbers.isEmpty()) {
            return null;
        }

        numbers = numbers.stream().sorted().collect(Collectors.toList());

        ListNode mergedKList = new ListNode(numbers.get(0));
        ListNode head = mergedKList;
        for (int i = 1; i < numbers.size(); i++) {
            head.next = new ListNode(numbers.get(i));
            head = head.next;
        }

        System.gc();
        return mergedKList;
    }
}
