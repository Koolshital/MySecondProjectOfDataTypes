package lecture10;

public class MyFibonacciSeries {//Fibonacci 0,1,1,2,3,5,8,13,....
    //                                      1 2 3 4 5 6..........
    public static void fibonacci(){
        int sum ;
        int first = 0;
        int second = 1;
       System.out.print("0 1 ");
        for ( int i = 2;i <10; i++){
            sum = first + second;
            System.out.print(sum+ " ");
            first = second;
            second = sum;
        }
    }
    public static void main(String[] args) {
        fibonacci();
    }
}
