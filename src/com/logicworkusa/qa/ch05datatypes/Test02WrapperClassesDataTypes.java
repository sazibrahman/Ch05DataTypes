package com.logicworkusa.qa.ch05datatypes;
public class Test02WrapperClassesDataTypes {
    public static void main(String[] args) {
        Integer intObj = Integer.valueOf(42);
        Double doubleObj = Double.valueOf(3.14);
        Character charObj = Character.valueOf('X');
        Boolean boolObj = Boolean.valueOf(true);

        System.out.println("Integer Object: " + intObj);
        System.out.println("Double Object: " + doubleObj);
        System.out.println("Character Object: " + charObj);
        System.out.println("Boolean Object: " + boolObj);
    }
}
