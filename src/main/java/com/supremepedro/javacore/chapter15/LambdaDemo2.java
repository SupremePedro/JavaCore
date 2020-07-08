package main.java.com.supremepedro.javacore.chapter15;
interface NumbericTest{
    boolean test(int n);
}

public class LambdaDemo2 {
    public static void main(String[] args) {
        NumbericTest isEven = (n)->n%2==0;
        if(isEven.test(10)) System.out.println("Чиcлo 10 четное");
        if(!isEven.test(9)) System.out.println("Чиcлo 9 нечетное");

        NumbericTest isNonNeg = (n)->n>=0;

        if(isNonNeg.test(1)) System.out.println("Чиcлo 1 неотрицательное");
        if(!isNonNeg.test(-1)) System.out.println("Чиcлo -1 отрицательное");
    }
}
