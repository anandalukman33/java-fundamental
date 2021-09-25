package com.course.javafundamental.operator;

public class OperatorEquality {

    public static void main (String[] args) {

        int value = 5;
        int anotherValue = 4;
        boolean result;
        result = value == anotherValue;

        //hasilnya false karena value dan anotherValue memiliki nilai yang berbeda.
        //bisa dibikin true dengan cara menambahkan ! di samping result
        //System.out.println("hasil 'value == anotherValue' adalah "+ !result);
        System.out.println("hasil 'value == anotherValue' adalah "+ result);
        System.out.println();

        System.out.println("Tidak sama dengan..");
        result = value != anotherValue;
        System.out.println("Hasil 'value != anotherValue' adalah "+ result);
        System.out.println();

        System.out.println("Lebih besar dari..");
        result = value > anotherValue;
        System.out.println("hasil dari 'value > anotherValue' adalah "+ result);
        System.out.println();

        System.out.println("Sama atau lebih besar dari..");
        result = value >= anotherValue;
        System.out.println("hasil dari 'value >= anotherValue' adalah "+result);
        System.out.println();

        System.out.println("kurang dari..");
        result = value < anotherValue;
        System.out.println("hasil dari 'value < anotherValue' adalah "+result);
        System.out.println();

        System.out.println("sama atau kurang dari..");
        result = value <= anotherValue;
        System.out.println("hasil dari 'value < anotherValue' adalah "+result);
        System.out.println();


    }
}
