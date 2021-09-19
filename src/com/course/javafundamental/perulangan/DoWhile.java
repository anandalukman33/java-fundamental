package com.course.javafundamental.perulangan;

public class DoWhile {
    public static void main (String [] args) {
        int value = 1;

        do {
            System.out.println("Angka : "+value);
            value++;
        } while (value <= 10);
    }
}

// Bedah Code Perulangan Do-While
// Bagaimana bisa menghasilkan output seperti di atas? Mari kita bahas bersama-sama:
// Kita mendeklarasikan variabel nilai dengan angka 1.
// int value = 1;

// Melakukan sebuah perintah terlebih dahulu.
// System.out.println("Angka : " + value);
// value++;

// Pengecekan suatu kondisi terhadap variabel. Apabila terpenuhi maka perintah dilanjutkan.
// while (value <= 10)