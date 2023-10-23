public class JewelsAndStones {
//    public int numJewelsInStones(String jewels, String stones) {
//        int count = 0;
//
//        for (int i = 0; i < stones.length(); i++) {
//            if (jewels.contains(String.valueOf(stones.charAt(i)))) {
//                count++;
//            }
//        }
//
//        return count;
//    }
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        for (int i : stones.toCharArray()) {
            if (jewels.indexOf(i) != -1) {
                count++;
            }
        }

        return count;
    }
}
