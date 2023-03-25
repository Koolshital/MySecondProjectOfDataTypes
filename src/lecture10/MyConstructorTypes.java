package lecture10;

public class MyConstructorTypes {
    MyConstructorTypes(){//user defined zero parameterised constructors
        int a = 45;
        int b = 10;
        System.out.println(a+b);
    }
    MyConstructorTypes(int x,int y){//parameterised constructors,Their name is same as class name,same syntex as method
        System.out.println(x*y);//no access modifier;no static, abstract,final or return type
    }
    MyConstructorTypes(String name,String hobby){
        System.out.println(name + " likes " + hobby);

    }
    public static void main(String[] args) {
        MyConstructorTypes myConstructorTypes = new MyConstructorTypes();
        MyConstructorTypes myConstructorTypes1 = new MyConstructorTypes(34,45);
    }
}
