package main.java.com.supremepedro.javacore.chapter21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExplicitChannelWrite {
    public static void main(String[] args) {
        try(FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("file2.txt"), StandardOpenOption.WRITE, StandardOpenOption.CREATE)){
            ByteBuffer mBuf = ByteBuffer.allocate(26);
            for (int i = 0; i < 26; i++) {
                mBuf.put((byte)('A' + i));
            }
            mBuf.rewind();
            fChan.write(mBuf);
        }
        catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути");
        }
        catch (IOException e) {
            System.out.println("Ошибка ввода-вывода");
            System.exit(1);
        }
    }
}
