package com.course.javafundamental.bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main (String[] args){
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("D://Users/0784/Documents/lukman.txt");
            out = new FileOutputStream("latihan_output.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
