package com.course.javafundamental.oop.accessmodifier.defaultt;

import com.course.javafundamental.oop.accessmodifier.privatee.KelasA;

public class Main {
    public static void main (String[] args) {

        /*
         Kode ini pasti akan mengalami kompiler error
         */
        KelasA kelasA = new KelasA();

        /*
        tidak bisa dibuka karena functionB, memberB, memberC itu tidak bersifat public
        karena tidak dalam package yang sama
         */
        // System.out.println(kelasA.functionB());
        // System.out.println(kelasA.memberB);
        // System.out.println(kelasA.memberC);

        KelasB kelasB = new KelasB();
        kelasB.methodC();
    }
}