import java.util.Arrays;

public class Shuffle {
    public static int[] shuffle(int[] nums, int n) {
        int[] newNums = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 1) {
                newNums[i] = nums[n];
                n++;
            } else  {
                newNums[i] = nums[count];
                count++;
            }
        }
        return newNums;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(nums, 3)));
    }
}
