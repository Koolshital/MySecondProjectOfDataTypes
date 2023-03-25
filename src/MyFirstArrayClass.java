import java.util.Arrays;

public class MyFirstArrayClass {
    public static void main(String[] args) {
        int[] arr ={24,32,23,232,34,56,27,3};
        //index     0   1  2  3  4 ....
        //length    1   2  3   4  5.....
        int[] numbers={34,44,44,78};
        float[] invoice={7.8f,9.7f,10.1f,6.4f};
        int myArrayLength = arr.length;//finding length of array =nameofvarible space give a name for length = name of array.length
        int myNumbersLength = numbers.length;
        int myFloatLength = invoice.length;
        System.out.println(myArrayLength);//sout (name for a length -calling length variable
        System.out.println(myNumbersLength);
        System.out.println(myFloatLength);
       for(int i=0;i<myArrayLength;i++){//finding even number from array using for loop
        if(arr[i]%2==0){
           System.out.println(arr[i]);}
        }
       for(int i=0;i<myFloatLength;i++){//finding invoice greater than 10
            if (invoice[i]>10){
               System.out.println(invoice[i]);
           }
        }
        for (int i:arr){//finding even numbers using for each loop
             if(i%2==0) {
                 System.out.println(i);
             }
            
        }
    }

}