package main.java.com.supremepedro.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.Stream;

class NamePhoneEmail{
    String name;
    String phonenum;
    String email;

    NamePhoneEmail (String n,String g, String e){
        name = n;
        phonenum = g;
        email = e;
    }
}

class NamePhone{
    String name;
    String phonenum;

    NamePhone(String n, String p){
        name = n;
        phonenum = p;
    }
}
public class StreamDemo5 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> list = new ArrayList<>();
        list.add(new NamePhoneEmail("Larry", "555-5555", "Larry@HerbSchildt.com"));
        list.add(new NamePhoneEmail("James", "555-4444", "James@HerbSchildt.com"));
        list.add(new NamePhoneEmail("Mary", "555-3333", "Mary@HerbSchildt.com"));

        System.out.println("Исходные элементы из списка list: ");
        list.stream().forEach((a) -> System.out.println(a.name + " " + a.phonenum + " " + a.email));
        System.out.println();

        Stream<NamePhone> namePhoneStream = list.stream().map((a) -> new NamePhone(a.name, a.phonenum));

        System.out.println("Список имен и номеров телефонов: ");
        namePhoneStream.forEach((a) -> System.out.println(a.name + " " + a.phonenum));
    }
}
