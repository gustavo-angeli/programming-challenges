import java.math.BigInteger;

public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        BigInteger num = new BigInteger(num1);
        return String.valueOf(num.multiply(new BigInteger(num2)));
    }
}
