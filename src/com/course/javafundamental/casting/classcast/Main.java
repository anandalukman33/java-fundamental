package com.course.javafundamental.casting.classcast;

public class Main {
    public static void main (String [] args) {
        Kucing anggora = new Kucing();

        Hewan hewan = anggora; //secara implisit upcasting
        hewan = (Hewan) anggora; // secara eksplisit melakukan casting dari subclass ke superclass

        Hewan hewan2 = new Kucing();
        ((Kucing) hewan2).meow(); // downcast hewan ke kucing, casting daei superclass ke subclass
        ((Kucing) hewan2).makan(); // downcast hewan ke kucing, casting daei superclass ke subclass
    }
}
