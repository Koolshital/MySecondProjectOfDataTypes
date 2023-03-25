package com.accessmodifier1;

public class ModifierClass2 {
    public static void main(String[] args) {
        ModifierClass1 myObjecta = new ModifierClass1();
        System.out.println(myObjecta.a);
        ModifierClass1 myObjectb = new ModifierClass1();
        System.out.println(myObjectb.b);
        ModifierClass1 myObjectd = new ModifierClass1();
        System.out.println(myObjectd.d);
        System.out.println(ModifierClass1.e);

      }
}
