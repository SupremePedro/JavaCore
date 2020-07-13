package main.java.com.supremepedro.javacore.chapter21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;
        try (SeekableByteChannel fChan =
                     Files.newByteChannel(Paths.get("file2.txt"))) {
            ByteBuffer mbuf = ByteBuffer.allocate(128);
            do {
                count = fChan.read(mbuf);
                if (count != -1) {
                    mbuf.rewind();
                }
                for (int i = 0; i < count; i++) {
                    System.out.print((char) mbuf.get());
                }
            } while (count != -1);
        } catch (InvalidPathException e) {
            System.out.println("Oшибкa указания пути "+e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода" + e);
        }
    }
}
