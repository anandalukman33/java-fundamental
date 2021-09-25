package com.course.javafundamental.operator;

public class OperatorConditional {
    public static void main (String[] args) {
        int value = 4;
        int anotherValue = 5;

        //Conditional AND (Kondisi Dan)
        System.out.println("conditional AND");
        boolean result = value == 3 && anotherValue == 5;
        boolean anotherResult = value != 3 && anotherValue ==5;
        System.out.println("Hasil Operator AND pada syarat value == 3 dan anotherValue == 5 adalah "+result);
        System.out.println("Hasil Operator AND pada syarat value != 3 dan anotherValue == 5 adalah "+anotherResult);
        System.out.println();


        //Conditional OR (Kondisi Atau)
        System.out.println("conditional AND");
        result = value == 3 || anotherValue == 5;
        anotherResult = value != 3 || anotherValue ==5;
        System.out.println("Hasil Operator OR pada syarat value == 3 dan anotherValue == 5 adalah "+result);
        System.out.println("Hasil Operator OR pada syarat value != 3 dan anotherValue == 5 adalah "+anotherResult);
        System.out.println();
    }
}
