package com.accessmodifier1;

public class ModifierClass1 {
    int a = 20;
    public int b = 10;
    private int c = 5;
    protected int d = 4;
    static int e = 7;
    public static void addNumbers(){
        int j = 11;
        int k= 22;
        System.out.println(j+k);//defining method simple method
    }
    public static void main(String[] args) {
        ModifierClass1 myObjecta = new ModifierClass1();
        System.out.println(myObjecta.a);
        addNumbers();//calling method
    }

}
