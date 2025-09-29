package com.pluralsight;

public class Format {
    public static void formatName(String first, String last) {
        System.out.println(last + " " + first);
    }

    public static void main(String[] args) {
        formatName("richie", "yin");
    }
}
