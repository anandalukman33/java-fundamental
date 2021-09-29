package com.course.javafundamental.generik;

public class Planet {
    private String name;
    private Double mass;

    public Planet(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }

    public void print() {
        System.out.println("Planet "+name+ ", mass: "+mass);
    }
 }
/*
Dibikin 2 karena Dari kode di class Main terlihat List<Planet>
lp tidak diizinkan menampung objek selain Planet.
Dalam kasus ini List<Planet> lp dilindungi compile-time type safety
di mana jika ada objek lain yang dimasukkan ke List<Planet> lp .
Tetapi dengan tipe selain Planet ,
seketika compile error, Artinya deteksilah lebih dahulu sebelum runtime (program dijalankan).
Bandingkan dengan List lo yang bisa menampung objek String ataupun Planet (bahkan semua jenis objek).
 */
 class Planet1 {
    private String name;
    private Double mass;

    public Planet1(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }

    public void print1() {
        System.out.println("Planet " + name + ", mass: " + mass);
    }
}