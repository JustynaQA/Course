import java.util.Scanner;

public class Time {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What time is it?");
        int timeInSeconds = scanner.nextInt();


        int hours = timeInSeconds/3600;
        int minutes = ((timeInSeconds- (3600* hours)))/60;
        int seconds = timeInSeconds%60;


        System.out.println( hours + ":" + minutes +":"  + seconds  );




    }





}
