public class IfElseLadderClass {
    public static void  checkMyMedal(int score) {//defining method for if else ladder condition
        if (score <= 250 && score > 0) {
            System.out.println("You get Bronze medal");
        } else if (score >= 251 && score <= 500) {
            System.out.println("You get Silver medal ");
        } else if (score >= 501 && score <= 750) {
            System.out.println("You get Gold medal");
        } else if (score >= 751 && score <= 1500) {
            System.out.println("You get Platinum medal");
        } else if(score<=0){
            System.out.println("Invalid score");
        } else {
            System.out.println("You move to the next level");


        }

    }

    public static void main(String[] args) {
        checkMyMedal(300);checkMyMedal(500);checkMyMedal(1000);checkMyMedal(0);
        checkMyMedal(-456);checkMyMedal(12345);
    }}


