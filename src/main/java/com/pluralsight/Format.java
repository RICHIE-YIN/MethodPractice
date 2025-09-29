package com.pluralsight;

public class Format {
    public static String formatName(String first, String last) {
//        System.out.println(last + " " + first);
        return last + ", " + first;
    }

    public static void main(String[] args) {
//        formatName("richie", "yin");
        System.out.println(formatName("Richie", "Yin"));
    }
}
