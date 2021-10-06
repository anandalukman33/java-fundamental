package com.course.javafundamental.casting;

public class contoh1 {
    /*
        Contoh dimana Int yang bervalue double dipaksakan menjadi Int sesuai tipe data yang dideklarasikan.
        jadi diperlukan Cast Trick.
     */
    public static void main (String [] args) {
        int a  = (int) 3.14;
        //String hasil = String.valueOf(a);
        System.out.println(a); // hasil akan 3 karena value 3.14 merupakan termasuk tipe double,
                                   // tapi dipaksakan dengan ngecasting pada tipe data yang di taruh di awal yaitu int,
                                   // jadi ketika double dibuat menjadi int, maka terjadilah pembulatan secara otomatis
    }
}
