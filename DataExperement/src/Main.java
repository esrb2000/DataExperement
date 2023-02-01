import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        System.out.println(getPeriodFromJavaBirthday());
    }

    public static int getPeriodFromJavaBirthday() {
        LocalDate birthday = LocalDate.of(1995, 05, 23);
        Period period = birthday.until(LocalDate.now());
        return period.getYears();
    }

}