public class FindMin {
    public int findMin(int[] nums) {
        int minNumber = 1000;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minNumber) {
                minNumber = nums[i];
            }
        }
        return minNumber;
    }
}
