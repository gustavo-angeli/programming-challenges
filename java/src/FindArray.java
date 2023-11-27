public class FindArray {
    public int[] findArray(int[] pref) {
        if (pref.length == 1 ) {
            return pref;
        }
        int[] ans = new int[pref.length];
        ans[0] = pref[0];
        for (int i = 1; i < pref.length; i++) {
            ans[i] = pref[i] ^ pref[i - 1];
        }
        return ans;
    }
}
