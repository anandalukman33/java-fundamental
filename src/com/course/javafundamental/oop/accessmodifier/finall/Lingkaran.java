package com.course.javafundamental.oop.accessmodifier.finall;

public class Lingkaran {
    static final double PI = 3.141;

    int jari = 7;

    final double getLuas() {
        return PI * (jari * jari);
    }
}
