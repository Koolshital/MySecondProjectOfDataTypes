public class MyVariableBook {
    int size = 15;//state or feature
    int weight = 100;
    static String colour = "white";
    public void readingBook(){
        System.out.println("the purpose is reading");//user defined method

    }
    public static void main(String[] args) {//predefined method
        int thickness = 5;
        MyVariableBook featureBook = new MyVariableBook();//object creation
        System.out.println(colour);//calling static variable inside the method,no need of object as variable is static
        System.out.println(featureBook.size);//calling instance(global) variable by using object
        System.out.println(featureBook.weight);// calling global variable using object
        System.out.println(thickness);//this varibale in main method so no need of object
        featureBook.readingBook();//calling method using object as its not static
    }

}
