package com.company;
public class Main {
    public static void main(String[] args) {
        String Str = new String("Добро-пожаловать-на-prog.kiev.ua");
        System.out.println("Возвращаемое значение: ");
        for (String retval : Str.split("-", 2)) {
            System.out.println(retval);
        }
        System.out.println();
        System.out.println("Возвращаемое значение: ");
        for (String retval : Str.split("-", 3)) {
            System.out.println(retval);
        }
        System.out.println();
        System.out.println("Возвращаемое значение: ");
        for (String retval : Str.split("-", 0)) {
            System.out.println(retval);
        }
        System.out.println();
        System.out.println("Возвращаемое значение: ");
        for (String retval : Str.split("-")) {
         System.out.println(retval);

        }
    }
}


