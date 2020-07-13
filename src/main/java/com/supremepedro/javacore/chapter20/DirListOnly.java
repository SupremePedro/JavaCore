package main.java.com.supremepedro.javacore.chapter20;

import java.io.File;
import java.io.FilenameFilter;

public class DirListOnly {
    public static void main(String[] args) {
        String dirname = "/";
        File f1 = new File(dirname);
        FilenameFilter only = new OnlyExt("sys");
        String s[] = f1.list(only);

        for (int i =0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
}

class OnlyExt implements FilenameFilter {
    String ext;

    public OnlyExt(String ext) {
        this.ext = "." + ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}
