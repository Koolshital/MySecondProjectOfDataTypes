public class TestClass {
    public static void findFactorial(int n){
        int result =1;
        if(n>0){
            for(int i =n;i>=1;i--){//or (int i=1;i<=n;i++)
                result = result*i;

            }
            System.out.println(result);
        }
    }
    public static void main(String[] args) {
        findFactorial(3);
        findFactorial(5);
    }
}
