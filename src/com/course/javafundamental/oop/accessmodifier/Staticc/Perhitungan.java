package com.course.javafundamental.oop.accessmodifier.Staticc;

public class Perhitungan {
    // static variabel hanya berjumlah satu, tidak peduli berapapun obyek yang dibuat.
    // termasuk juga sebagai variabel yang berdiri sendiri tanpa perlu instance dari kelas.
    public static int nilai = 0;

    // Protected tidak perlu membuat objeknya di dalam kelas Main
    protected static int getNilai() {
        return nilai;
    }

    // membuat perulangan dari 0
    Perhitungan(){
        nilai++;
    }
}
