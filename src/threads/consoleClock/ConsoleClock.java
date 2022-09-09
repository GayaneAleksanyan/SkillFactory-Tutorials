package threads.consoleClock;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ConsoleClock extends Thread {
    @Override
    public void run() {
        while(!(isInterrupted())) {
            DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
            Calendar calendar = Calendar.getInstance();
            calendar.getTime();

            String time = dateFormat.format(calendar.getTimeInMillis());
            System.out.println(time);

            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                break;
            }
        }
        System.out.println("The clock was stopped.");
    }
}
