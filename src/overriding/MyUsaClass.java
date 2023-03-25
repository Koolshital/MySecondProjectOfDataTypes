package overriding;

public class MyUsaClass {
    public  void salesTaxes(){
        System.out.println("Tax will be 15% on all goods");
    }
    public static void main(String[] args) {
        MyUsaClass myUsaClass = new MyUsaClass();
        myUsaClass.salesTaxes();
    }
}
