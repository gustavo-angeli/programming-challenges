import java.math.BigInteger;

public class LastDigit {
    public static int mySolution(BigInteger n1, BigInteger n2) {
        if (n2.toString().equals("0")) return 1;

        String n1LastDigit = String.valueOf(n1).substring(n1.toString().length() - 1);
        int[] standardSequence = new int[6];
        Integer powLastDigit = 0;

        for (int i = 1; i < 6; i++) {
            powLastDigit = (int) Math.pow(Double.parseDouble(n1LastDigit), i);
            powLastDigit = Integer.parseInt(String.valueOf(powLastDigit).substring(powLastDigit.toString().length() - 1));

            if (standardSequence[1] != powLastDigit) {
                standardSequence[i] = powLastDigit;
            } else if (standardSequence[i] == 0) {
                i = 6;
            }
        }

        int count = 0;

        for (int i = 0; i < standardSequence.length; i++) {
            if (standardSequence[i] != 0) count++;
        }

        if (count == 0) return 0;

        int leftover = n2.intValue() % count;

        if (leftover == -1) {
            return standardSequence[3];
        } else if (leftover == -3) {
            return standardSequence[1];
        }

        leftover = Math.abs(leftover);

        return (leftover == 0) ? standardSequence[count] : standardSequence[leftover];
    }

    public static int betterSolution(BigInteger n1, BigInteger n2) {
        return n1.modPow(n2, BigInteger.TEN).intValue();
    }

    public static void main(String[] args) {
        System.out.println(betterSolution(new BigInteger("546630824330578149516528598374939764893488370750181620968743147430375140015068318521094057"), new BigInteger("1122527418641218351497973949205826998307034535328829351437802334767871636707101571455219443")));
        System.out.println(mySolution(new BigInteger("546630824330578149516528598374939764893488370750181620968743147430375140015068318521094057"), new BigInteger("1122527418641218351497973949205826998307034535328829351437802334767871636707101571455219443")));
    }
}
