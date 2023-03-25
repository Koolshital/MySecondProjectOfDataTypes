package overriding;

public class MyNewyorkClass extends MyUsaClass{//overriding can be done only thru inheritance
    public void salesTaxes(){//overriding method from MyUsaClass(parent class)

        System.out.println("Taxes will be 20% on all goods ");/*implemention changed from parentclass method
        In overriding method name should be same ,number of parameters should be same ,type of parameteres should be same
        as parent class.It happens between different classes*/

    }

    public static void main(String[] args) {
        MyNewyorkClass myNewyorkClass = new MyNewyorkClass();
        myNewyorkClass.salesTaxes();
    }
}
