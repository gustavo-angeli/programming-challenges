public class GrowthPopulation {
    public static int nbYear(int p0, double percent, int aug, int p) {
        percent = percent / 100;
        int years = 0;
        while (p0 < p) {
            p0 += p0 * percent + aug;
            years++;
        }
        return years;
    }

    public static void main(String[] args) {
        System.out.println(nbYear(1500, 5, 100, 5000));
    }
}
