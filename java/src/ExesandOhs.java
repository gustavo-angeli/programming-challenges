public class ExesandOhs {
    public static boolean getXO(String str) {
        int countX = 0;
        int countO = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x' || str.charAt(i) == 'X') {
                countX++;
            } else if (str.charAt(i) == 'o' || str.charAt(i) == 'O') {
                countO++;
            }
        }
        return countX == countO;
    }
}
