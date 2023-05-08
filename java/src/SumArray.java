import java.util.Arrays;

public class SumArray {
    public static double sum(double[] numbers) {
        return Arrays.stream(numbers).reduce(0, (a, b) -> a + b);
    }
}
