package com.course.javafundamental.perulangan;

public class ForBersarang {
    public static void main (String [] args) {

        int a = 5;
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// Inilah yang disebut dengan perulangan for bersarang.
// Perulangan ke pertama akan mempengaruhi perulangan kedua,
// begitu juga ketika ada perulangan ketiga, keempat dan seterusnya,
// maka akan dipengaruhi oleh perulangan sebelumnya.