import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWords {
    public static String spinnedWords(String sentence) {
        ArrayList<String> words = new ArrayList<>();
        Arrays.stream(sentence.split(" "))
                .map(i -> i.substring(0, 1) + i.substring(1, i.length()))
                .forEach(i -> words.add(i));

        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() >= 5) {
                words.set(i, String.valueOf(new StringBuilder(words.get(i)).reverse()));
            }
        }

        return words.stream()
                .map(i -> i.substring(0, 1) + i.substring(1, i.length()))
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        System.out.println(spinnedWords("Hey wollef sroirraw"));
    }

}
