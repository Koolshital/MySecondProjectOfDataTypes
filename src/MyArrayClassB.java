public class MyArrayClassB {
    public static void main(String[] args) {
        int[] numbers ={23,0,-3,45,67,100,546};
        int smallestNumber = numbers[0];//assumption first index =smallest number
        for (int newValue:numbers){//use of for each
            if(smallestNumber>newValue){
                smallestNumber=newValue;
            }
    }
        System.out.println(smallestNumber);
        int higestnumber =numbers[0];//assumption that first index is the highest number
        for (int newNumber:numbers) {
            if(higestnumber<newNumber){
                higestnumber=newNumber;

            }

        }
        System.out.println(higestnumber);



}
}



