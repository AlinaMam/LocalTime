import java.time.LocalTime;

public class main1 {
    public static void main(String[] args) {
        LocalTime fiveThirty = LocalTime.of(5, 30);
        LocalTime noon = LocalTime.of(12, 0, 0);
        LocalTime almostMidnight = LocalTime.of(23, 59, 59, 0);

        System.out.println(fiveThirty);
        System.out.println(noon);
        System.out.println(almostMidnight);
    }
}
