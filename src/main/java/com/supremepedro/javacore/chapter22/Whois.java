package main.java.com.supremepedro.javacore.chapter22;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Whois {
    public static void main(String[] args) throws Exception{
        int c;
        Socket s = new Socket("internic.net", 43);
        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();
        String str = "MHProfessional.com";
        byte buf[] = str.getBytes();
        out.write(buf);
        while ((c = in.read()) != -1) {
            System.out.print((char)c);
        }
        s.close();
    }
}
