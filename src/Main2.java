import java.time.LocalTime;

public class Main2 {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        int nanoSecond = now.getNano();

        System.out.println("hour " + hour);
        System.out.println("minute " + minute);
        System.out.println("second " + second);
        System.out.println("nanoSecond " + nanoSecond);
    }
}
