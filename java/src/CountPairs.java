import java.util.List;

public class CountPairs {
    public int countPairs(List<Integer> nums, int target) {
        int pairs = 0;

        for (int i = 0; i < nums.size() - 1; i++) {
            for (int j = 1; j < nums.size(); j++) {
                if (nums.get(i) <= nums.get(j) && nums.get(i) + nums.get(j) < target) {
                    pairs++;
                }
            }
        }
        return pairs;
    }
}
