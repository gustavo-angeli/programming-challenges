public class Regex {

    public static boolean validatePin(String pin) {
        if (pin.length() == 4) {
            return pin.matches("[0-9]{4}");
        } else if (pin.length() == 6) {
            return pin.matches("[0-9]{6}");
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(validatePin("1234"));
    }

}
