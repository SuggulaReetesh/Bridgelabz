package com.bridgelabz.lib;

import java.util.Locale;

public class StdOut {
    private static final Locale LOCALE = Locale.US;
	public static void print(String s) {
		System.out.print(s);
	}

	public static void println(String s) {
		System.out.println(s);
	}

	public static void println() {
		System.out.println("println function");
	}

	public static void printf(String format, Object... args) {
		System.out.printf(LOCALE, format, args);
	}

	public static void main(String args[]) {
		print("Test");
        println("Test");
        println();
        printf("%.6f\n", 1.0/7.0);

	}

}