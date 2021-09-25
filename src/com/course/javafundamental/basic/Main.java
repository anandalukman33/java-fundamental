package com.course.javafundamental.basic;

import com.course.javafundamental.basic.datatype.TestString;
import com.course.javafundamental.basic.kendaraan.Kereta;
import com.course.javafundamental.basic.kendaraan.Mobil;
import com.course.javafundamental.basic.kendaraan.Motor;
import com.course.javafundamental.basic.musik.Gitar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Main {
    public static void main (String[] args) {
//        System.out.println("Hello world!");
//        Gitar.bunyi();
//        Mobil.jumlahBan();
//        Motor.jumlahBan();
//        Kereta.jumlahBan();
        TestString.testString(args);

        Date today = new Date();
        System.out.println("Hari ini : " +today);
        Date tomorrow = DateUtils.addDays(today, 1);
        System.out.println("Besok : "+tomorrow);
    }
}
