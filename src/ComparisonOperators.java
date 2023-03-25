public class ComparisonOperators {
    public static void main(String[] args) {
        int balance = 5000;
        int withdraw =5004;
        int overdraft = 1000;
        int savingAccountbalance = 3000;
        boolean ans = balance >= withdraw;
        boolean ans1 = withdraw <= overdraft;
        boolean ans2 = balance == withdraw;
        boolean ans4 = withdraw <= balance + overdraft;
        boolean ans3 = balance != withdraw;
        System.out.println(ans);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans4);
        System.out.println(ans3);

    }
}
