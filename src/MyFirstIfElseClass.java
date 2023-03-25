public class MyFirstIfElseClass {
    public static void findLeapYear(int year) {//defining method accessmodifier  +nonaccessmodifier + return type +method name (parameters){
        if ((year%4== 0 && year%100!=0) ||(year %400== 0))
            System.out.println("Year " + year + " is a leap year.");
        else
            System.out.println("Year " +year+ " is not a leap year."); }
    /*if else condition for leap year ,if remainder is 0 when you divide by 4 && remainder is nor 0 when divide by
    100 or remainder is 0 when you divide by 400*/


    public static void main(String[] args) {
        findLeapYear(1900);//calling method directly as it is static
        findLeapYear(2020);
        findLeapYear(2023);
        findLeapYear(200);
        findLeapYear(-200);
        findLeapYear(1700);findLeapYear(1800);findLeapYear(1600);findLeapYear(2000);
    }



    }
