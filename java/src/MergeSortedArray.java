import java.util.Arrays;
import java.util.Collections;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == 0 && count < n) {
                nums1[i] = nums2[count];
                count++;
            }
        }


        Arrays.sort(nums1);
        Collections.reverse(Arrays.asList(nums1));
    }

    public static void main(String[] args) {
        merge(new int[]{1,2,3,0,0,0}, 6, new int[]{2,5,6}, 3);
    }
}
