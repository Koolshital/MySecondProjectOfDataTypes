public class MyArrayClassC {
    public static int findSmallestNumber() {

        int[] myNumbers = {23, -1, 76, 0, 45, 291};
        int smallest = myNumbers[0];
         for (int i =0;i<myNumbers.length;i++) {
            if (myNumbers[i] < smallest)
                smallest = myNumbers[i];
        }
        return smallest;
    }

    public static void main(String[] args)
    {
        System.out.println(findSmallestNumber());
    }}