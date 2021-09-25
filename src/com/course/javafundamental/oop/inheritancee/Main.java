package com.course.javafundamental.oop.inheritancee;

public class Main {
    public static void main (String [] args) {
        Hewan hewan = new Hewan(); // memanggil constructor
        System.out.println("Apakah hewan IS-A Objek -> "+(hewan instanceof Object));
        System.out.println("Apakah hewan IS-A Hewan -> "+(hewan instanceof Hewan));
        System.out.println("Apakah hewan IS-A Hewan -> "+(hewan instanceof Kucing));

        System.out.println("-----------------------------------------------------------");

        Hewan kucing = new Kucing(); // memanggil constructor
        System.out.println("Apakah hewan IS-A Objek -> "+(kucing instanceof Object));
        System.out.println("Apakah hewan IS-A Hewan -> "+(kucing instanceof Hewan));
        System.out.println("Apakah hewan IS-A Kucing -> "+(kucing instanceof Kucing));

        System.out.println("-----------------------------------------------------------");

        hewan.makan(); // kucing mewarisi metode makan() dari parent class Hewan
        kucing.makan();
        ((Kucing) kucing).makan("daging ikan");

        System.out.println("-----------------------------------------------------------");

        Kucing anggora = new Kucing ("Anggora", "tropis");
        Kucing persian = new Kucing ("Anggora", "subtropis");
        Kucing kucingKampung = new Kucing ("Regular Cat", "subtropis");

        System.out.println(anggora.toString());
        System.out.println(persian.toString());
        System.out.println(kucingKampung.toString());

        System.out.println("anggora equals persian? "+anggora.equals(persian)); // hasilnya true karena rasnya sama.
        System.out.println("anggora equals Kucing Kampung? "+anggora.equals(kucingKampung));

        System.out.println("-----------------------------------------------------------");

        Object o = new Kucing(); // kucing adalah Object
        Hewan h = new Kucing(); // kucing adalah Hewan
        Kucing k = new Kucing(); // kucing adalah Kucing, pastinya :)

        //o.makan(); -> error, karena method makan() tidak ada di class Object
        h.makan();
        k.makan();

        Object object = k; // bisa langsung diassign
        Hewan hewanK= k; // bisa langsung diassign

        //object.makan(); -> error, karena method makan() tidak ada di class Object
        hewanK.makan();

        Kucing kucingK = (Kucing) h; // tidak bisa langsung diassign, perlu casting
        kucingK.makan();

        Hewan harimau = new Hewan();
        Mamalia mamalia = new Kucing();
        //Kucing kucing1 = (Kucing) harimau; // compile OK tetapi runtime error ClassCastException
    }
}
