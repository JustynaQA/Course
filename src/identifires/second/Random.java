package identifires.second;

import identifires.first.Parent;


//klasa potomna w innej paczce nie ma dostępu do pól i metod PRIVATE oraz DOMYŚLNYCH (PACKAGE) czyli bez identyfikatora dostępu, a także do pól i metod PROTECTED

public class Random {

    public void testIdentifier() {
        Parent parent = new Parent();


        System.out.println(parent.first);
//        System.out.println(parent.second);
//        System.out.println(parent.third);

        parent.firstMethod();
//        parent.secondMethod();
//        parent.thirdMethod();

    }
}


