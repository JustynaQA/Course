public class PracaDomowaOdwracanieTablicy {
    // Liczby z zakresu 1-100 podzielne przez 3;
    // Odwrócenie elementów w tablicy [1.3,5,7, 0] > [0, 7, 5,3,1]

//    public static void main(String[] args) {
//        for (int i = 1; i < 100; i++) {
//            if (i%3==0) {
//                System.out.println(i);
//            }
//        }
//    }
public static void main(String[] args) {
    int[] tab = new int[] {1,3,5,7,0};
    for (int i = 0; i < tab.length / 2; i++) {
        int temp = tab [i]; // dla i=1 czyli 1
        tab[i] = tab[tab.length -1 - i]; // czyli 4 liczba > 0
        tab[tab.length-1-i] = temp; // 1
        System.out.println("iteracja numer " + i);
    }
    for (int i = 0; i < tab.length; i++) {
        System.out.println(tab[i]);

    }
}



}
