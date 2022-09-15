package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        int ta = a == null ? 0 : Integer.parseInt(a);
        int tb = b == null ? 0 : Integer.parseInt(b);

        return String.valueOf(ta + tb);
    }
}
