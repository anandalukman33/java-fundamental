package com.course.javafundamental.generik;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String [] args) {
        List lo = new ArrayList(); // List tanpa type-parameter
        //lo.add("lo - String 1"); // lo menampung objek String
        lo.add(new Planet1("Earth", 0.09));

        for (Object o : lo) {
            Planet1 p = (Planet1) o; // perlu type-casting dari Object ke Planet
            p.print1();
        }

        List<Planet> lp = new ArrayList(); // List dengan type-parameter Planet
        lp.add(new Planet("Mercury", 0.06)); // lp menampung objek Planet
        // lp.add("lp - String 1"); // baris ini compile-error, lp tidak diijinkan menampung objek String
        lp.add(new Planet("Venus", 0.92));

        for (Planet p : lp) {
            p.print();
        }
    }
}
