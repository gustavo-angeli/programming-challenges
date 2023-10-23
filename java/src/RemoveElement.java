import java.util.ArrayList;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        System.out.println(nums[nums.length - 1] * nums[nums.length - 1]);
        ArrayList list = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                list.add(nums[i]);
            }
        }
        return list.size();
    }

    public static void main(String[] args) {
        removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2);
    }
}
