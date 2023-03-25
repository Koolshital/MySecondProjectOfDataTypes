public class IfElseNestedClass {
    public void checkMaxiNumber(int a, int b, int c, int d) {
        if (a != b && b != c && c != d && d != a && a != c && b != d) {//checking no numbers should be same
            if (a > b && a > c && a > d) {//checking if a is biggest among all
                System.out.println(a + " is a bigger number.");
            } else if (b > c && b > a && b > d) {//checking if b is biggest among all
                System.out.println(b + " is a bigger number.");
            } else if (c > a && c > b && c > d) {
                System.out.println(c + " is a bigger number.");
            } else {
                System.out.println(d + " is a bigger number.");
            } }else {
                System.out.println("Two or more numbers are same.");
            }}
            public static void main(String[] args) {
        IfElseNestedClass maxNumber = new IfElseNestedClass();//creat object as method is not static
        maxNumber.checkMaxiNumber(0,12,16,100);
        maxNumber.checkMaxiNumber(-13,18,10,3);
        maxNumber.checkMaxiNumber(67,13,10,67);
        maxNumber.checkMaxiNumber(34,45,45,20);
        maxNumber.checkMaxiNumber(12,19,78,78);
        maxNumber.checkMaxiNumber(-4,34,45,-4);
        maxNumber.checkMaxiNumber(-5,-9,-50,0);
    }
}
