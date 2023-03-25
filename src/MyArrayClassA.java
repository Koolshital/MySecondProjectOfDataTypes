public class MyArrayClassA {
    public static void main(String[] args) {
        int[] numbers ={-4,-34,-20,-78,-89,-80,-51,-1000,-5};
        int highest = numbers[0];//assumption that first index is highest number
        for (int i=0;i<numbers.length;i++){
            if(numbers[i]>highest){
                highest=numbers[i];
            }
        }
        int smallest = numbers[0];
        for(int i=0;i<numbers.length;i++){
            if (numbers[i]<smallest){
                smallest=numbers[i];
            }
        }
        System.out.println(highest);
        System.out.println(smallest);
    }
}
