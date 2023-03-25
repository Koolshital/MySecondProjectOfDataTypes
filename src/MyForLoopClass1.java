public class MyForLoopClass1 {
    public static void main(String[] args) {
        int sum = 0;//sum of 1 to 100 here 1+2+3...+100
        for (int i=1;i<=100;i++){//here value of sum and i are changing in every loop
            sum = sum + i;//override value
        }
        System.out.println(sum);
    }
}
