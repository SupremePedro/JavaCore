package main.java.com.supremepedro.javacore.chapter20;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;

        try (FileInputStream f = new FileInputStream("test.txt")) {
            System.out.println("Oбщee количество доступных байтов: " + (size = f.available()));
            int n = size / 40;
            System.out.println("Пepвыe " + n + " байтов, " +
                    " прочитанных из файла по очереди методом read()");
            for (int i = 0; i < n; i++) {
                System.out.print((char) f.read());
            }

            System.out.println(" \nBce еще доступно : " + f.available());

            System.out.println("Чтeниe следующих " + n + " байтов по очереди методом read(b[])");
            byte b[] = new byte[n];
            if (f.read(b) != n) {
                System.out.println("Нельзя прочитать " + n + " байтов.");
            }
            System.out.println(new String(b, 0, n));
            System.out.println(" \nBce еще доступно : " + (size = f.available()));
            System.out.println("Пропустить половину оставшихся байтов методом skip ()");
            f.skip(size / 2);
            System.out.println("Bce еще доступно : " + f.available());
            System.out.println("Чтeниe " + n / 2 + " байтов, размещаемых в конце массива");

            if(f.read(b,n/2,n/2)!=n/2){
                System.out.println("Нельзя прочитать "+ n/2 + " байтов.");
            }

            System.out.println(new String(b, 0, b.length));
            System.out.println("\nBce еще доступно: "+f.available());

        } catch (IOException e) {

        }
    }
}
