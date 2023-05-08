public class ReverseArray {
    public static int[] digitize(long n) {
        String number = String.valueOf(n);
        StringBuilder sb = new StringBuilder(number).reverse();
        int[] reverseOrder = new int[sb.length()];

        for (int i = 0; i < sb.length(); i++) {
            reverseOrder[i] = Integer.parseInt(String.valueOf(sb.charAt(i)));
        }

        return reverseOrder;
    }
}
