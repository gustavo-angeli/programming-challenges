import java.util.ArrayList;

public class NumberUtils {
    public static boolean isNarcissistic(Integer number) {
        String n = String.valueOf(number);
        ArrayList<Double> numbers = new ArrayList();

        for (int i = 0; i < n.length(); i++) {
            numbers.add(Math.pow(Integer.valueOf(n.substring(i, i + 1)), n.length()));
            Double sum = numbers.stream().reduce(0.0, (a, b) -> a + b);
            if (sum.intValue() == number) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isNarcissistic(153));
    }
}
