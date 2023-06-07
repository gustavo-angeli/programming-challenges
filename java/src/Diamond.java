public class Diamond {

    public static String showDiamond (int size) {
        if (size <= 0 || size % 2 == 0) return null;

        StringBuilder sb = new StringBuilder();
        int asterisk = 1, count = (int) (Math.floor(size / 2));

        while (asterisk != size) {
            for (int i = 0; i < count; i++) {
                sb.append(" ");
            }

            for (int i = 0; i < asterisk; i++) {
                sb.append("*");
            }
            sb.append("\n");
            asterisk += 2;
            count--;
        }

        asterisk = 0;
        count = 0;

        while (size > 0) {
            if (size < asterisk) {
                for (int i = 0; i < count; i++) {
                    sb.append(" ");
                }
            }
            for (int i = 0; i < size; i++){
                sb.append("*");
            }
            sb.append("\n");
            asterisk = size;
            size -= 2;
            count++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(showDiamond(0));
    }

}

