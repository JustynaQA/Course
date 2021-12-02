import java.util.Scanner;

public class Time {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What time is it?");
        int timeInSeconds = scanner.nextInt();

        int totalHours = (timeInSeconds / 3600);
        int hours = totalHours % 24;
        int minutes = ((timeInSeconds - (3600 * totalHours))) / 60;
        int seconds = timeInSeconds % 60;

        String time = (hours) + ":";

        if (minutes < 10) {
            time = time + "0";
            time = time + minutes;

        } else {
            time = time + minutes;
        }
        if (seconds <10) {
            time = time +":"+ "0";
            time = time + seconds;

        } else {
            time = time + ":" + seconds;
        }

        System.out.println(time);
    }
}
