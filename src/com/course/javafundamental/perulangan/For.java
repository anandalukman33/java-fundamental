package com.course.javafundamental.perulangan;

public class For {
    public static void main (String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Nilai i adalah : "+i);
        }
    }
}

/**
 *      penjelasan tentang perulangan for
 */

//      for (
        // Dalam hal ini kita menginisialisasi angka dimulai dari 1.
//      int i = 1;

        // Pada tahap ini kita menentukan batasan nilai akhir suatu perulangan
        // atau disebut dengan termination.
        // Contoh di atas adalah angka lebih kecil atau sama dengan 10.
//      i <= 10;

        // Kita menentukan aksi terhadap perulangan, aksi tersebut bisa menaikkan (increment) atau menurunkan (decrement).
        // Apabila kita ingin melakukan aksi increment maka nilai awal (initialization) harus lebih kecil daripada nilai akhir (termination).
        // Begitupun sebaliknya, jika melakukan aksi menurun maka nilai awal (initialization) harus lebih besar daripada nilai akhir (termination).
        // Seperti contoh di atas kita melakukan aksi increment.
//      i++
//
//      )