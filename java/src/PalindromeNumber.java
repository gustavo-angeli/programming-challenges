public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        StringBuilder reverseNumber = new StringBuilder();

        if (x < 0) {
            return false;
        }

        for (int i = number.length() - 1; i >= 0; i--) {
            reverseNumber.append(number.charAt(i));
        }
        long y = Long.valueOf(String.valueOf(reverseNumber));

        return x == y;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1234567899));
    }

}
