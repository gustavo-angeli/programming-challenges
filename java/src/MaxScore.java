import java.util.*;

public class MaxScore {

    public static int maxScore1(int[] nums) {
        int count = 0;
        long sum = 0;

        List<Integer> list = new ArrayList<>(Arrays.stream(nums).boxed().toList());

        list.sort(Comparator.reverseOrder());

        for (int i : list) {
            if (i + sum <= 0) {
                break;
            }
            sum += i;
            count++;
        }

        return count;
    }
    public static int maxScore2(int[] nums) {
        Arrays.sort(nums);

        if (nums[nums.length - 1] == 0) {
            return 0;
        }

        int count = 0;
        long sum = 0;

        for (int i = nums.length - 1; i > -1; i--) {
            if (sum + nums[i] <= 0) {
                break;
            }
            sum += nums[i];
            count++;
        }

        return count;
    }
    public static int maxScore3(int[] nums) {
        Arrays.sort(nums);
        long sum = 0;
        int ans = 0;
        for(int i = nums.length - 1; i >= 0; i--) {
            sum += nums[i];
            if(sum > 0) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(maxScore3(new int[]{-687767,-860350,950296,52109,510127,545329,-291223,-966728,852403,828596,456730,-483632,-529386,356766,147293,572374,243605,931468,641668,494446}));
    }
}
