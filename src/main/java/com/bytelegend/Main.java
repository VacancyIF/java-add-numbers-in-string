package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        int intA = 0;
        int intB = 0;
        if (null != a) {
            intA = Integer.parseInt(a);
        }
        if (null != b) {
            intB = Integer.parseInt(b);
        }
        return String.valueOf(intA + intB);
    }
}
