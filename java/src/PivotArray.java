import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PivotArray {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> lessThan = new ArrayList<>();
        List<Integer> greaterThan = new ArrayList<>();
        int equals = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > pivot) {
                greaterThan.add(nums[i]);

            } else if (nums[i] < pivot) {
                lessThan.add(nums[i]);
            } else {
                equals++;

            }
        }
        for (int i = 0; i < equals; i++) {
            lessThan.add(pivot);
        }
        lessThan.addAll(greaterThan);

        for (int i = 0; i < nums.length; i++) {
            nums[i] = lessThan.get(i);
        }

        return nums;
    }
}
