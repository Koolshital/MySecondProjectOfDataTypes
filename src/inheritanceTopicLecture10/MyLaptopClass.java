package inheritanceTopicLecture10;

public class MyLaptopClass extends MyComputerParent {//subclass of MYComputerclass,this is called single inheritance
    public  void myMethod2(){
        System.out.println("     *   *   *    ");
    }

    public static void main(String[] args) {
        MyLaptopClass myLaptopClass = new MyLaptopClass();
        myLaptopClass.myMethod1();//inheritates method from superclass so don't need to create object of superclass
        myLaptopClass.myMethod2();

    }
}
