package main.java.com.supremepedro.javacore.chapter15;

interface SomeFunct<T> {
    T func(T t);
}

public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        SomeFunct<String> reverse = (str) -> {
            String result = "";
            int i;
            for (i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println("Лямбдa обращается на "+reverse.func("Лямбда"));
        System.out.println("Выражение обращается на "+reverse.func("Выражение"));

        SomeFunct<Integer> factorial = (n)->{
            int result =1;

            for(int i =1; i<=n;i++){
                result = i*result;
            }
            return result;
        };

        System.out.println("Фaктopиaл числа З равен " + factorial.func(3));
        System.out.println("Фaктopиaл числа 5 равен " + factorial.func(5));
    }
}
