package identifires.first;

public class Random {

   //  klasa w tej samej paczce ze stworzonym obiektem nie ma dostępu do pól i metod PRIVATE

    public void testIdentifier() {
        Parent parent = new Parent();
        System.out.println(parent.first);
        System.out.println(parent.second);
        System.out.println(parent.third);

        parent.firstMethod();
        parent.secondMethod();
        parent.thirdMethod();

    }
}
