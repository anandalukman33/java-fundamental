package com.course.javafundamental.oop.propertiandmetode;

public class Hewan {

    // Properti atau fields
    // Inisiasi dengan nilai inisial
    double tinggi;
    double berat;

    // Inisiasi melalui konstruktor
    int umur;

    // Konstruktor dengan parameter
    Hewan(int umur) {
        this.umur = umur;
//    Agar lebih praktis maka kita bisa samakan nama variabelnya dan gunakan kode this untuk membedakan kedudukannya.
//    Hewan(int umurParam) {
//        umur = umurParam;
    }

    void lari() {
        System.out.println("Berlari dengan sangat cepat..");
    }

    void jalan() {
        System.out.println("Berjalan dengan pelan..");
    }

    void makan(){
        System.out.println("Makan dengan menggunakan mulut..");
    }

    double getBerat() {
        return berat;
    }
    double getTinggi() {
        return tinggi;
    }
    int getUmur() {
        return umur;
    }
}
