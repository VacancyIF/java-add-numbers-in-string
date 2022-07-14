package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        String resulting_string = "";
        if(a != null) {
            resulting_string += a;
        }
        if(b != null) {
            resulting_string += b;
        }

        return resulting_string;
    }
}
