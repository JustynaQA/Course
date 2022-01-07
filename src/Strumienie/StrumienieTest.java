package Strumienie;

import java.awt.image.ImagingOpException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StrumienieTest {
    public static void main(String[] args) {

        // tworzenie strumienia z tablicy lub kolekcji lub typy prymitywne

        List<String> names = Arrays.asList("Tom", "John", "Kate", "Ann");
//strumień:
        Stream<String> streamNames = names.stream();
//strumień z tablicy
        Stream<Integer> streamInt = Arrays.asList(new Integer[]{1, 2}).stream();
// strumień z double
        DoubleStream soubleSteeam = DoubleStream.of(3, 3, 2, 1, 1, 2, 4, 5);
        IntStream intStream = IntStream.range(1, 100);


        // przetrwarzanie danych
        // filter - filtrowanie
        // map - zmieenia każdy element an coś innego np. zmienia kazdą liczbę x2
        // limit - zwraca określoną ilość elementów
        //peek - pozwala przeprowadzić operację na każdym elemencie

        // forEach - wykonanie akcji dla każdego elementu strumienia
        //count - zwróci ilość elementów w strumieniu
        //allaMatch  - sprawdza czy wszystkie elementy w strumieniu spełniają warunek
        //collect - zwraca nowy typ na podstawie strumienia np. listę po filtrowaniu

        List<String> mofifiedNames = streamNames.filter(el -> el.startsWith("T"))
                .map(el -> el.toUpperCase())
//                .forEach(el -> System.out.println(el));
                .collect(Collectors.toList());

        System.out.println(mofifiedNames.get(0));
        System.out.println(mofifiedNames.size());

        long count = intStream.filter(el -> el > 20)
                .map(el -> el * 2)
//                .limit(10)
//                .forEach(el -> System.out.println(el));
                .count();
        System.out.println(count);


        

    }
}

