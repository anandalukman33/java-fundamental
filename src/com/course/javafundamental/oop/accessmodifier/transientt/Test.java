package com.course.javafundamental.oop.accessmodifier.transientt;

import java.io.Serializable;

public class Test implements Serializable {

    // Variabel ini tidak akan dijaga nilainya
    transient int nilaiA;

    // Variabel ini akan dijaga nilainya
    double nilaiB;
    String nilaiC;
}
