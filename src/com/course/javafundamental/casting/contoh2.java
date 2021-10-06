package com.course.javafundamental.casting;

public class contoh2 {
    /*
        Contoh kasus disini tipe double ingin diubah menjadi sebuah String
        caranya cukup memberikan String.valueOf(variable_yg_bernilai_double)
     */
    public static void main (String[] args) {
        double i = 3.14;
        String hasil = String.valueOf(i);
        System.out.println(hasil);
    }
}
