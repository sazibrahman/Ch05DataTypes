package com.logicworkusa.qa.ch05datatypes;

public class Test01PrimitiveDataTypes {
	public static void main(String[] args) {
		byte byteVar = 127;
		short shortVar = 32767;
		int intVar = 2147483647;
		long longVar = 9223372036854775807L;
		float floatVar = 3.14159f;
		double doubleVar = 3.141592653589793;
		char charVar = 'A';
		boolean boolVar = true;

		System.out.println("Byte: " + byteVar);
		System.out.println("Short: " + shortVar);
		System.out.println("Int: " + intVar);
		System.out.println("Long: " + longVar);
		System.out.println("Float: " + floatVar);
		System.out.println("Double: " + doubleVar);
		System.out.println("Char: " + charVar);
		System.out.println("Boolean: " + boolVar);
	}
}
