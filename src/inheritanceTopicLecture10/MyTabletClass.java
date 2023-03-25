package inheritanceTopicLecture10;

public class MyTabletClass extends  MyLaptopClass{/*subclass of MyLaptopClass and also MyComputerClass so called
   multilevel inheritance.It can use properties of both superclass,*/
    public void myMethod3(){
        System.out.println("   *  *  *  *  *   ");}


    public static void main(String[] args) {
        MyTabletClass myTabletClass = new MyTabletClass();
        myTabletClass.myMethod1();
        myTabletClass.myMethod2();
        myTabletClass.myMethod3();
        myTabletClass.myMethod3();
        myTabletClass.myMethod2();
        myTabletClass.myMethod1();
    }
}
