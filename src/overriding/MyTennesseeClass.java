package overriding;

public class MyTennesseeClass extends MyUsaClass {
    public static void main(String[] args) {
        MyTennesseeClass myTennesseeClass = new MyTennesseeClass();//implementation is not changed so result will be same as parent class
        myTennesseeClass.salesTaxes();
    }
}
