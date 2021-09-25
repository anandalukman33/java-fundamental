package com.course.javafundamental.array;

public class InisiasiArray {
    public static void main (String[] args) {

        int[] arrInt = new int[1000000];

        //Inisiasi dan menampilkan arrInt dari element ke 1 sampai 100000
        for (
                int x = 0;
                x < arrInt.length;
                x++
        ) {
            arrInt[x] = x + 1;
            System.out.println(arrInt[x]);
        }
    }
}
