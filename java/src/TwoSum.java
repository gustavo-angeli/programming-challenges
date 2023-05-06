public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (key + nums[j] == target) {
                    int[] positions = {i, j};
                    int anterior = nums[j];
                    return positions;
                }
            }
        }
        return null;
    }

    public static void main(String args[]) {
        int[] nums = {2,5,5,11};
        int target = 10;
        System.out.println(twoSum(nums, target));
    }
}
