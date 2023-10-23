import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {
    public static String spinnedWords(String sentence) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList(sentence.split(" ")));

        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() >= 5) {
                words.set(i, String.valueOf(new StringBuilder(words.get(i)).reverse()));
            }
        }

        return words.stream()
                .map(i -> i.charAt(0) + i.substring(1))
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        System.out.println(spinnedWords("Hey wollef sroirraw"));
    }

}
