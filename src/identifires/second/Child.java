package identifires.second;

import identifires.first.Parent;

public class Child extends Parent {

    //klasa potomna w innej paczce nie ma dostępu do pól i metod PRIVATE oraz DOMYŚLNYCH (PACKAGE) czyli bez identyfikatora dostępu

    public void testIdentifier() {
        System.out.println(first);
//        System.out.println(second);
        System.out.println(third);
//        System.out.println(fourth);
        firstMethod();
//        secondMethod();
        thirdMethod();
//        fourthMethod();
    }
}

