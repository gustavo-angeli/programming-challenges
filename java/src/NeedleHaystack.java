public class NeedleHaystack {
    public static String findNeedle(Object[] haystack) {
//        for (int i = 0; i < haystack.length; i++) {
//            if (haystack[i] != null && haystack[i] == "needle") {
//                return "found the needle at position " + i;
//            }
//        }
//        return null;
        return String.format("found the needle at position %d", java.util.Arrays.asList(haystack).indexOf("needle"));
    }

    public static void main(String[] args) {
        Object[] haystack1 = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
        System.out.println(findNeedle(haystack1));
    }
}
