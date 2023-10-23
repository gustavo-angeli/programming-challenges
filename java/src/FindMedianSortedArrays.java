import java.util.Arrays;

public class FindMedianSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int tamanhoTotal = nums1.length + nums2.length;

        int[] array = new int[tamanhoTotal];



        System.arraycopy(nums1, 0, array, 0, nums1.length);

        System.arraycopy(nums2, 0, array, nums1.length, nums2.length);



        int arrayMiddlePos = array.length / 2;

        Arrays.sort(array);

        if (array.length % 2 == 0) {

            return (double) (array[arrayMiddlePos] + array[arrayMiddlePos - 1]) / 2;

        }

        return array[arrayMiddlePos];
    }

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1, 3}, new int[]{2,7}));
    }
}
