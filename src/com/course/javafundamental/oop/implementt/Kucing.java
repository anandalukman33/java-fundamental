package com.course.javafundamental.oop.implementt;

import com.course.javafundamental.oop.interfaces.Hewan;
// implements itu harus di awali dengan abstract disini atau di method makan()
public abstract class Kucing implements Hewan {

    // jika kita ingin mengimplementasikan interface maka kita harus membuat
    // method signature (nama, parameter, return) yang sama disertai isi kode program
    // untuk metodenya. Seperti ini contohnya :

    @Override
    public void makan() {

    }
}
