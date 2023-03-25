package com.hp;

public class ArithmaticOperators1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 4;
        int d =8;
        int e = 2;
        ++d;
        d+=5;
        System.out.println(a-b);
        System.out.println(a+c);
        System.out.println(b*c);
        System.out.println(d/e);
        System.out.println(b%e);
        System.out.println(a++);// postfix first assign then increase so ans is 10
        System.out.println(++a);// prefix first increase then assign so ans is 12
        System.out.println(d);

    }
}
