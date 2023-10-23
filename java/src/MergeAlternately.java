public class MergeAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int size = Math.min(word1.length(), word2.length());

        if (word1.length() == word2.length()) {
            for (int i = 0; i < word1.length(); i++) {
                sb.append(word1.charAt(i)).append(word2.charAt(i));
            }
            return sb.toString();
        } else if (word1.length() < word2.length()) {
            for (int i = 0; i < size; i++) {
                sb.append(word1.charAt(i)).append(word2.charAt(i));
            }
            for (int i = size; i < word2.length(); i++) {
                sb.append(word2.charAt(i));
            }
            return sb.toString();
        }

        for (int i = 0; i < size; i++) {
            sb.append(word1.charAt(i)).append(word2.charAt(i));
        }
        for (int i = size; i < word1.length(); i++) {
            sb.append(word1.charAt(i));
        }
        return sb.toString();
    }
}
