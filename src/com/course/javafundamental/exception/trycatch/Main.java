package com.course.javafundamental.exception.trycatch;

import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main (String [] args) {
        try {
            String location = "D://Users/0784/Documents/lukman.txt";
            File file = new File(location);
            FileReader fr = new FileReader(file);
            System.out.println("File berhasil ditemukan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
