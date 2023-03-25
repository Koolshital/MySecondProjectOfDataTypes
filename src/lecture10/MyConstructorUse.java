package lecture10;

public class MyConstructorUse {
    String medicineName ;// declare global variables
    int medicineQuantity;//
    MyConstructorUse(String name,int stock){//create constructor to intialise value
        medicineName = name;// intialise the value
        medicineQuantity = stock;
    }
    public void getStockDetails(){//method to print value of global variable
        System.out.println("Name of the medicine is " + medicineName);
        System.out.println("Stock available is  "+ medicineQuantity + " boxes." );

    }

    public static void main(String[] args) {//main method
        MyConstructorUse myConstructorUse = new MyConstructorUse("Paracetamol",200);//object created to call constructor
        myConstructorUse.getStockDetails();//method called to display details as per requirement
        MyConstructorUse myConstructorUse1 =new MyConstructorUse("Ibuprofen",134);
        myConstructorUse1.getStockDetails();


    }
}
