public class GetConcatenation {
    public static int[] getConcatenation(int[] nums) {
        int[] concatenated = new int[nums.length * 2];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            concatenated[i] = nums[i];
            count++;
        }
        for (int i = 0; i < nums.length; i++) {
            concatenated[count] = nums[i];
            count++;
        }
        System.gc();
        return concatenated;
    }

    public static void main(String[] args) {
        System.out.println(getConcatenation(new int[]{1,2,1}));
    }
}
