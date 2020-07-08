package main.java.com.supremepedro.javacore.chapter15;

interface MyFunc6<R,T>{
    R func(T n);
}

class MyClass5<T>{
    private T val;

    MyClass5(T v){val = v;}

    MyClass5(){val=null;}

    T getVal(){return val;}
}
class MyClass4{
    String str;

    MyClass4(String s){str = s;};

    MyClass4(){str="";}

    String getVal(){return str;}
}
public class ConstructorRefDemo3 {
    static <R,T> R myClassFactory(MyFunc6<R,T> cons,T v){
        return cons.func(v);
    }

    public static void main(String[] args) {
        MyFunc6<MyClass5<Double>,Double> myClassCons = MyClass5<Double>::new;

        MyClass5<Double> mc = myClassFactory(myClassCons, 100.1);

        System.out.println("Значение val в объекте mc равно "+mc.getVal());

        MyFunc6<MyClass4, String> myClassCons2 = MyClass4::new;

        MyClass4 mc2 = myClassFactory(myClassCons2,"Лямбда");
        System.out.println("Значение str в объекте mc2 равно "+mc2.getVal());
    }
}
