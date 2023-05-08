import java.util.Arrays;

public class LongestCommonPrefix {

//    public static String longestCommonPrefix(String[] strs) {
//        if (strs.length == 1) return "";
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < strs.length - 1; i++) {
//            if (strs[i].isBlank()) return "";
//            builder = new StringBuilder(strs[i + 1]);
//            for (int j = strs[i].length(); j > 0; j--) {
//                if (!strs[i].startsWith(String.valueOf(builder))) {
//                    builder.deleteCharAt(builder.length() -1);
//                }
//            }
//        }
//        return String.valueOf(builder);
//    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 0; i < strs.length; i++){
            System.out.println(strs[i].indexOf(prefix));
            while (strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String args[]) {

        String[] words = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(words));
    }

}
