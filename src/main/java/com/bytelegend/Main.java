package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        int res = 0;
        res = null == a ? 0 : Integer.parseInt(a);
        res = null == b ? res : Integer.parseInt(b) + res;
        return String.valueOf(res);
    }
}
