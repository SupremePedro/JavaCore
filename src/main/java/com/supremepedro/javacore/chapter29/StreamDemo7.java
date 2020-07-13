package main.java.com.supremepedro.javacore.chapter29;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo7 {
    public static void main(String[] args) {
        List<NamePhoneEmail> list = new ArrayList<>();
        list.add(new NamePhoneEmail("Larry", "555-5555", "Larry@HerbSchildt.com"));
        list.add(new NamePhoneEmail("James", "555-4444", "James@HerbSchildt.com"));
        list.add(new NamePhoneEmail("Mary", "555-3333", "Mary@HerbSchildt.com"));

        Stream<NamePhone> nameAndPhone = list.stream().map((a)-> new NamePhone(a.name, a.phonenum));

        List<NamePhone> npList = nameAndPhone.collect(Collectors.toList());

        System.out.println("Имена и номера телефонов в списке типа List: ");
        for (NamePhone np: npList
        ) {
            System.out.println(np.name + ": " + np.phonenum);
        }



        nameAndPhone = list.stream().map((a)-> new NamePhone(a.name, a.phonenum));

        //  а теперь создать множество типа Set, вызвав метод collect()

        Set<NamePhone> npSet = nameAndPhone.collect(Collectors.toSet());

        System.out.println("\nИмена и номера телефонов в множестве типа Set: ");

        for (NamePhone np: npSet
        ) {
            System.out.println(np.name + ": " + np.phonenum);
        }
    }
}
