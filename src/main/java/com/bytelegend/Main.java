package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        int a1;
        int b1;
        if (a == null) {
            a = "0";
        }
        if (b == null) {
            b = "0";
        }
        a1 = Integar.valueOf(a);
        b1 = Integar.valueOf(b);
        return String.valueOf(a1 + b1);
    }
}
