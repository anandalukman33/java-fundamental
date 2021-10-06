package com.course.javafundamental.datetime;

import java.util.Calendar;

public class WaktuSpesifik {
    public static void main (String [] args) {

        // Menampilkan waktu sekarang
        Calendar calendar = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah "+calendar.getTime());

        // Menampilkan waktu 15 hari yang lalu
        calendar.add(Calendar.DATE, -15);
        System.out.println("15 hari yang lalu adalah : " +calendar.getTime());

        // Menampilkan waktu 4 bulan yang akan datang
        calendar.add(Calendar.MONTH, 4);
        System.out.println("4 Bulan kemudian adalah : "+calendar.getTime());

        // Menampilakn waktu 2 tahun yang akan datang
        calendar.add(Calendar.YEAR, 2);
        System.out.println("2 Tahun kemudian adalah : "+calendar.getTime());
    }
}
