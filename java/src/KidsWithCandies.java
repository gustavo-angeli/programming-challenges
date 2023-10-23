import java.util.*;

public class KidsWithCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;

        for (int i : candies) {
            max= i >= max ? i : max;
        }

        List<Boolean> result = new ArrayList<>(candies.length);

        for (int i : candies) {
            result.add(i+extraCandies>=max);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{2,3,5,1,3}, 0));
    }
}
