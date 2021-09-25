package com.course.javafundamental.oop.accessmodifier.finall;

/*
Lihat di class Lingkaran untuk mengetahui method final berguna
jika kita ingin membuat etode yang tidak dapat diubah.
 */

public class Perhitungan {
    // final variabel hanya bisa diinisiasi sekali.
    // ini menandakan bahwa variabel yang sudah dideklarasikan final tidak dapat diganti dengan objek lainnya.
    final int nilai = 5;

    // biasanya final digunakan bersamaan dengan static untuk membuat suatu konstanta.
    // misalkan code konstanta dibawah ini yaitu nilai PI.
    static final double PI = 3.141;

    void ubahNilai() {

        // kode di bawah akan menampilkan error, karena menandakan variabel final
        //nilai = 10;
    }
}
