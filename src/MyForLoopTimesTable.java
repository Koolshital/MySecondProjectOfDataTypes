public class MyForLoopTimesTable {
    //create the method which can calculate any times table
public static void timestable(int tablenumber){
    System.out.println("This is timestable of " + tablenumber);//outside for loop
    System.out.println("***********************************");//outside for loop
    for(int i=1;i<=12;i++){
        System.out.println(tablenumber +"x"+i+"="+tablenumber*i);
    }
    System.out.println("***********************************");//sout outside the for loop otherwise will come after every line as loop
}

    public static void main(String[] args) {
    for(int a=1;a<=12;a++){//for loop used  to create table number requirement from 1 to 12 in main method
        timestable(a);
    }

    }
}





