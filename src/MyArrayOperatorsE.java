public class MyArrayOperatorsE {
    public static void main(String[] args) {
        int[] myNumbers ={12,23,34,45,56,67,78,89,90};
        myNumbers[5]=50;//changing value of index 5 from 67 to 50
       myNumbers[1] = myNumbers[2] +myNumbers[5];//changing value of index 1
            //   84   =    34        +    50
        System.out.println(myNumbers[1]);//call out index 1
        for (int i:myNumbers) {
            if (i%2==0) {//getting only even number from array
                System.out.println(i);
        }
        }
}}
