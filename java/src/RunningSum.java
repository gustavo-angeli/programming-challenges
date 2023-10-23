public class RunningSum {
    public int[] runningSum(int[] nums) {
        int[] numsSum = new int[nums.length];
        numsSum[0] = nums[0];
        for (int i = 1; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                numsSum[i] = nums[i] + nums[j];
            }
        }
        return numsSum;
    }
}
