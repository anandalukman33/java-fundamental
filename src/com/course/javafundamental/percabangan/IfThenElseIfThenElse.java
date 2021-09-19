package com.course.javafundamental.percabangan;

public class IfThenElseIfThenElse {
    public static void main (String [] args) {

        int nilaiUjian = 80;
        char ipk;

        if (nilaiUjian >= 90) {
            ipk = 'A';
        } else if (nilaiUjian >= 80 ) {
            ipk = 'B';
        } else if (nilaiUjian >= 70 ) {
            ipk = 'C';
        } else if (nilaiUjian >= 60 ) {
            ipk = 'D';
        } else if (nilaiUjian >= 50 ) {
            ipk = 'E';
        } else {
            ipk = 'F';
        }
        System.out.println("Nilai ujian pada 'nilaiUjian = 80' adalah "+ipk);
    }
}
