package com.course.javafundamental.collectiontype;

import java.util.ArrayList;
import java.util.List;

public class ListPlanet {
    public static void main (String [] args) {

        // Deklarasi Array
//        String[] heroes = new String[2];
//        heroes[0] = "razor";
//        heroes[1] = "bristleback";
        //heroes[2] = "zeus"; // error ArrayIndexOutOfBoundsException karena ukuran Array tetap


        // menggunakan ArrayList
        List<String> planets = new ArrayList<>();
        planets.add("mercury"); // method add() untuk menambahkan objek ke List
        planets.add("venus");
        planets.add("earth");
        planets.add("mars"); // objek lainnya masih bisa terus ditambahkan ke List

        System.out.println("List planets awal : ");
        // method size() untuk mendapatkan ukuran List
        for (int i = 0; i < planets.size(); i++) {
            // method get() untuk melihat isi List pada index i
            System.out.println("\t index-"+ i + " = " + planets.get(i));
        }

        planets.remove("venus"); // method remove() untuk mengeluarkan objek dari List

        System.out.println("List planets akhir:");
        for (int i = 0; i < planets.size(); i++) {
            System.out.println("\t index-"+ i + " = " + planets.get(i));

        }
    }
}
