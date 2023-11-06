import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class Main3 {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();

        int hourAMPM = now.get(ChronoField.HOUR_OF_AMPM); // 0 - 11
        int hourDay = now.get(ChronoField.HOUR_OF_DAY); // 0 - 23
        int minuteDay = now.get(ChronoField.MINUTE_OF_DAY);
        int minuteHour = now.get(ChronoField.MINUTE_OF_HOUR);
        int secondDay = now.get(ChronoField.SECOND_OF_DAY);
        int secondMinute = now.get(ChronoField.SECOND_OF_MINUTE);
        long nanoDay = now.getLong(ChronoField.NANO_OF_DAY);
        int nanoSecond = now.get(ChronoField.NANO_OF_SECOND);

        System.out.println("Часы: " + hourAMPM);
        System.out.println("hourDay: " + hourDay);
        System.out.println("minuteDay: " + minuteDay);
        System.out.println("minuteHour: " + minuteHour);
        System.out.println("secondDay: " + secondDay);
        System.out.println("secondMinute: " + secondMinute);
        System.out.println("nanoDay: " + nanoDay);
        System.out.println("nanoSecond: " + nanoSecond);
    }
}
