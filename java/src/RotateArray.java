import java.util.Arrays;

public class RotateArray {
//
//    public void rotate(int[] nums, int k) {
//        int tempNum = 0;
//        for (int i = 0; i < k; i++) {
//            for (int j = nums.length - 1; j > 0; j--) {
//                if (j == nums.length - 1) {
//                    tempNum = nums[0];
//                    nums[0] = nums[nums.length - 1];
//                }
//                nums[j] = nums [j - 1];
//                if (j == 1) {
//                    nums[j] = tempNum;
//                }
//            }
//        }
//    }
//
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        if (k == 0) {
            return;
        }

        int[] result = new int[n];

        System.arraycopy(nums, 0, result, k, n - k);
        System.arraycopy(nums, n - k, result, 0, k);
        System.arraycopy(result, 0, nums, 0, n);
    }

}
