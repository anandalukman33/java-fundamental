package com.course.javafundamental.filenavigationlist;

import java.io.File;

/*
    Maksud dari File Navigation List adalah untuk melihat file apa saja yang berada
    dalam direktori D://java/latihan1 jika kosong maka tidak menampilkan apa2
    kalau ada dia akan mencetak dari variabel = String[] paths
 */

public class Main {
    public static void main(String args[]) {
        String dirname = "/java/latihan1";
        File file = null;
        String[] paths;
        try {
            // Instansiasi objek File
            file = new File(dirname);
            // Ambil list files dan masukkan ke string paths
            paths = file.list();
            // Tampilkan semua path yang ada
            for (String path : paths) {
                System.out.println(path);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}