import java.util.Scanner;

public class ZadanieDomowe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Proszę podaj swój wiek");
        int age = scan.nextInt();
        if (age < 18 && age >=0){
            System.out.println("Nie możesz kupić alkoholu");
        } else if (age < 0){
            System.out.println("Wprowadzono nieprawidłową wartość");
        } else {
            System.out.println("Możesz zrobić zakupy");
        }
    }
}

