package main.java.com.supremepedro.javacore.chapter15;

interface StringFunc4{
    String func(String n);
}
class MyStringOps2 {
    String strReverse(String str) {
        String result = "";
        int i;
        for (i = str.length() - 1; i >= 0; i--)
            result += str.charAt(i);
        return result;
    }
}

public class MethodRefDemo2 {
    static String stringOp(StringFunc4 sf, String s){
        return sf.func(s);
    }
    public static void main(String[] args) {
        String inStr = "Лямбда-выражения повышают эффективность Java";
        String outStr;

        MyStringOps2 stringOps = new MyStringOps2();

        outStr = stringOp(stringOps::strReverse,inStr);

        System.out.println("Иcxoднaя строка: "+inStr);
        System.out.println("Oбpaщeннaя строка: "+outStr);
    }
}

