package com.course.javafundamental.filenavigation;

import java.io.File;

public class Main {
    public static void main (String[] args) {
        String dirname = "/java/latihan1";
        File file = new File(dirname);

        //Membuat Direktori
        //terlihat ketika memanggil metode mkdirs direktori terbuat di D:\java

        //  mkdir(), metode untuk membuat directory. Nilainya true ketika sukses dan false ketika gagal. Gagal bisa disebabkan oleh path directory yang sudah yang ada, atau karena keseluruhan path nya tidak ada.
        //  mkdirs(), metode yang digunakan untuk membuat directory dan parent directory-nya.
        file.mkdirs();
    }
}
