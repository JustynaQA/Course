
// umoliwiają cykliczne wykonanie ciągu instrukcji określoną ilość razy
// i zmienna sterująca, która mówi kiedy przerwać pętlę


public class PetlaFor {

    public static void main(String[] args) {
//        for (int i = 0; i < 100; i = i+2) {
//            System.out.println(i);
//        }

        for (int i =0; i <100; i++) {
        if (i%5==0) {
            System.out.println(i);
        }
        }

//          for ( int sth = 0; sth < 300; sth++) {
//              System.out.println(" Działa");
//          }




    }

}
