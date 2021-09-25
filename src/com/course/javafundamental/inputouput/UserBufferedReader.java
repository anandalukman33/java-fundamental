package com.course.javafundamental.inputouput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferedReader {
    public static void main (String[] args){

        //Hampir sama dengan cara memanggil scanner akan tetapi ada perbedaannya
        //yaitu dengan dipanggilnya IOException sebagai penanggulangan error saat menginput pada BufferedReader
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        System.out.println("Program penjumlahan sangat sederhana");
        System.out.println();

        // kalau mau diganti menjadi String seperti dibawah ini
        String value = "";              // kalau mau diganti menjadi int : int value = 0;
        String anotherValue= "";        // kalau mau diganti menjadi int : int anotherValue = 0;
        try {
            System.out.println("Masukkan Kata pertama : ");
            // System membaca dengan tipe data sesuai value dengan bantuan bufferedReader
            value = String.format(bufferedReader.readLine());           // kalau mau ngebaca tipe int yaitu >> value = Integer.parseInt(bufferedReader.readLine());
            System.out.println();
            System.out.println("Masukkan Kata kedua : ");
            // System membaca dengan tipe data sesuai value dengan bantuan bufferedReader
            anotherValue = String.format(bufferedReader.readLine());    // kalau mau ngebaca tipe int yaitu >> anotherValue = Integer.parseInt(bufferedReader.readLine());
        // pengecualian dari tipe data dari value yang sudah ditentukan, karena ini pakai String, maka selain String tidak bisa dibaca.
        // itulah fungsi pengecualian dari IOException
        } catch (IOException e) {
            // bantuan pelacakan dari IOException, tanpa ini fungsi IOException tidak bisa melacak bagian errornya.
            e.printStackTrace();
        }
        String result = value +" "+ anotherValue;
        System.out.println("Hasilnya adalah "+result);
    }
}


