package com.course.javafundamental.oop.interfaces;

public interface Hewan {
    /*
    kenapa public static final menjadi suatu modifier yang tidak terpakai?
    karena file interface termasuk sebagai static, oleh sebab itu field (String RESPIRASI = "oksigen")
    itu memiliki penulisan huruf besar semua atau uppercase, atai jika ada dua kata maka diberikan underscore
    seperti ini ANANDA_LUKMAN
     */
//    public static final String respirasi = "oksigen";
    String RESPIRASI = "oksigen";


    public void makan();

}
