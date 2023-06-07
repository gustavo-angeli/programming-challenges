import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PeriodTime {
    public static boolean periodIsLate(LocalDate last, LocalDate today, int cycleLength) {
        return last.until(today, ChronoUnit.DAYS) > cycleLength;
    }

    public static void main(String[] args) {
        System.out.println(periodIsLate(
                LocalDate.of(2016, 6, 13),
                LocalDate.of(2016, 7, 16),
                28)
        );
    }
}
