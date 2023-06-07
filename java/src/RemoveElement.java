import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        List<String> arr = Arrays.stream(nums)
                .mapToObj(i -> String.valueOf(i))
                .collect(Collectors.toList());

        while (arr.contains(String.valueOf(val))) {
            arr.remove(String.valueOf(val));
        }

        return arr.size();
    }

    public static void main(String[] args) {
        System.out.println("\n" + removeElement(new int[]{3,2,2,3}, 3));
        System.out.println("\n" + removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }
}
