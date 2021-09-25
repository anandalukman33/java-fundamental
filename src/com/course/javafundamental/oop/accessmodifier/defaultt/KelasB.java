package com.course.javafundamental.oop.accessmodifier.defaultt;

import com.course.javafundamental.oop.accessmodifier.privatee.KelasA;

public class KelasB extends KelasA {

    @Override
    protected void methodC(){
        super.methodC();

        System.out.println("Contoh pemanggilan protected dari package luar");
    }
}
