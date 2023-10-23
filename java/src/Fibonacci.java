public class Fibonacci {
    public static long[] productFib(long prod) {
        long n1 = 0, n2 = 1, n3;
        while (n1 * n2 < prod) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
        }
        return new long[]{n1, n2, n1 * n2 == prod ? 1 : 0};
    }

    public static void main(String[] args) {
        productFib(2932589879121L);
    }
}
