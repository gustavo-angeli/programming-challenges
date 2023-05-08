public class SquareNumbers {

    public static boolean isSquare(int n) {
        Double root = Math.sqrt(n);
        root = Math.floor(root);

        if (root * root != n) return false;

        return true;
    }

    public static void main(String args[]) {
        System.out.println(isSquare(22323866));
    }
}
