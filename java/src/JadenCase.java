import java.util.ArrayList;

public class JadenCase {
    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.isBlank()) {
            return null;
        }

        ArrayList<String> charList = new ArrayList<>();
        StringBuilder uppercasePhrase = new StringBuilder();

        for (int i = 0; i < phrase.length(); i++) {
            charList.add(String.valueOf(phrase.charAt(i)));
        }

        for (int i = 0; i < charList.size(); i++) {
            if (i == 0) {
                charList.set(i, charList.get(i).toUpperCase());
            }
            if (charList.get(i).equals(" ")) {
                charList.set(i + 1, charList.get(i + 1).toString().toUpperCase());
            }

            uppercasePhrase.append(charList.get(i));
        }

        return String.valueOf(uppercasePhrase);
    }
    public static void main(String args[]) {
        String a = "aaaa aaaA aaa Aaaaa";
        System.out.println(toJadenCase(a));
    }
}
// Other way to solve this problem

//        public static String toJadenCase(String phrase) {
//            if (null == phrase || phrase.length() == 0) {
//                return null;
//            }
//
//            return Arrays.stream(phrase.split(" "))
//                    .map(i -> i.substring(0, 1).toUpperCase() + i.substring(1, i.length()))
//                    .collect(Collectors.joining(" "));
//        } better than my code

// Other person code
