package com.accessmodifier2;

public class ModifierClass3 {
    public static int multiplyTwoNumbers() {
        int a = 45;
        int b = 12;
        int c = a * b;
        return c; //return type method ,doesn't have void instead it has variable
        //calling in main method by sout(method name());and also need to return int
        //if not static then create object and call it sout(obj.method());

    }

    public String myNameSurname() {
        String Name = "Shital";
        String Surname = "Dalal";
        String Fullname = "Shital Dalal";//nonstatic return method
        // then creat object and call it sout(obj.method());

        return Fullname;
    }

    public static void main(String[] args) {
        System.out.println(multiplyTwoNumbers());
        ModifierClass3 myName = new ModifierClass3();
        System.out.println(myName.myNameSurname());
    }
}
