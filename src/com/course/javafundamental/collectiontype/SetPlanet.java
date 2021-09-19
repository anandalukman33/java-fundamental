package com.course.javafundamental.collectiontype;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class SetPlanet {
    public static void main (String[] args) {


        // menggunakan HashSet
        Set<String> planets = new HashSet<>();
        planets.add("mercury");  // method add() untuk menambahkan objek ke Set
        planets.add("venus");
        planets.add("earth"); // menambahkan objek "earth" beberapa kali = sistem akan mengetahui kalau ada objek duplikat sehingga hasilnya tetap satu.
        planets.add("earth");
        planets.add("mars");
        planets.add("jupiter"); // objek bisa terus ditambahkan ke Set

        // method size() untuk mendapatkan ukuran Set
        System.out.println("Set planets awal : (Jumlah Array = "+planets.size()+")");
        for (String planet: planets) {
            System.out.println("\t "+planet);
        }

        // method remove() untuk mengeluarkan objek dari Set
        planets.remove("venus");

        System.out.println();
        System.out.println("Set planet akhir : (Jumlah Array = "+planets.size() + ")");

        // looping menggunakan Iterator
        for (Iterator iterator = planets.iterator(); iterator.hasNext(); ) {
            System.out.println("\t "+iterator.next());
        }
    }
}
