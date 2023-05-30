package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        int tempA;
        int tempB;
        if (a == null) {
            tempA = 0;
        } else {
            tempA = Integer.parseInt(a);
        }

        if (b == null) {
            tempB = 0;
        } else {
            tempB = Integer.parseInt(b);
        }

        return Integer.toString(tempA + tempB);
    }
}
