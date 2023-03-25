public class MySwitchClass {/*switch (expression which is variable){
                              case 1:
                              sout(logic
                              break;
                              case 2(repeat as per requirement)
                              default:
                              sout(logic)
                              )*/
    public static void daysOfWeek(int a){
        switch (a){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Input is incorrect");
        }
    }
    public static void main(String[] args) {
        daysOfWeek(3);//calling method(expression which is variable)
        daysOfWeek(9);
        daysOfWeek(0);
        daysOfWeek(-6);
    }
}
