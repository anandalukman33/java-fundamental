package com.course.javafundamental.inputouput;

import java.util.Scanner;

public class InputOutputFunction {
    public static void main (String[] args) {
        //Deklarasi fungsi tools dari Scanner sebagai inputan dalam terminal
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program penjumalahan sangat sederhana");
        System.out.println();

        System.out.println("Masukan Angka pertama : ");
        //memunculkan inputan yang harus diisi berupa integer (angka)
        int value = scanner.nextInt();

        System.out.println("Masukan Angka kedua : ");
        //memunculkan inputan yang harus diisi berupa integer (angka)
        int anotherValue = scanner.nextInt();

        // setelah kedua angka telah dimasukkan maka untuk memberikan hasil
        // outputnya dapat membuat variabel baru dengan logik pertambahan atau
        // operasi aritmatika lainnya.
        int result = value + anotherValue;
        System.out.println("Hasilnya adalah "+result );
    }
}
