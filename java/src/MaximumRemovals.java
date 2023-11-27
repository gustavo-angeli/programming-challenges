public class MaximumRemovals {
    public int maximumRemovals(String s, String p, int[] removable) {
        int arrLength = removable.length;
        if (s.length() > arrLength && p.length() > arrLength) {
            return Math.min(s.length(), p.length());
        }
        return 0;
    }
}
