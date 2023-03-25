package lecture10;

public class MySwapNumber{
    public static void main(String[] args) {
        int a = 6;
        int b =10;
         int temp = a;//if you want to swap the values then make temporary integer which is equals to first integer
         a = b;
         b = temp;//then compare second integer with temporary integer
        System.out.println(a);
        System.out.println(b);
    }
}
