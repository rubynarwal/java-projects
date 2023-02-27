
import java.time.LocalTime;
public class TimeClock {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            LocalTime currentTime = LocalTime.now();
            System.out.println(currentTime);
            Thread.sleep(100);
        }
    }
}
