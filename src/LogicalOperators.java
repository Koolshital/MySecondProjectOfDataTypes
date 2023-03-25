public class LogicalOperators {
    public static void main(String[] args) {
        int a = 20;
        int b= 25;
        boolean total = a > b && b < 30;
        // false true so answer should be false
        int x = 16;
        int y = 56;
        boolean ans = x < y || y > 60;
        //true false ans should be true
        boolean ans1 = !( x > y && y > 50);
        //! (false && true\ ans should be false)
        //!(false)
        // true
        boolean ans2 = !( x > y || y > 51);
        // !(false || true)
        //!(true)
        // false
        System.out.println(ans2);
        System.out.println(ans1);
        System.out.println(total);
        System.out.println(ans);
    }
}
