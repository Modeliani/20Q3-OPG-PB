package pkg20q3.opg.pb.article.apps;

import java.time.Duration;
import java.time.LocalDateTime;
import pkg20q3.opg.pb.article.utils.Console;

public class StopWatchApp {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.now();
        Console.readString("Press [ENTER] to stop");
        LocalDateTime stop = LocalDateTime.now();

        Duration d = Duration.between(start, stop);

        System.out.println("Took: " + String.format(
                "%d:%02d:%02d:%09d",
                d.toHours(),
                d.toMinutes(),
                d.getSeconds() % 60,
                d.getNano()
        ));
    }
}