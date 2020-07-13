package main.java.com.supremepedro.javacore.chapter21;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class MyFileVisitor extends SimpleFileVisitor<Path> {
    public FileVisitResult visitFile(Path path, BasicFileAttributes attributes){
        System.out.println(path);
        return FileVisitResult.CONTINUE;
    }
}
public class DirTreeList {
    public static void main(String[] args) {
        String dirname = "src\\";
        System.out.println("Дepeвo каталогов, начиная с каталога " +dirname + ":\n");
        try {
            Files.walkFileTree(Paths.get(dirname), new MyFileVisitor());
        }catch (IOException e){
            System.out.println("Ошбика ввода-вывода");
        }
    }
}
