package lecture11;

public class MyPolymorphismClassOverloading {//example of overloading with same method with different number and types of parameters

    public void multiplication() {//Overloading can be done with static and nonstatic methods
        int a = 10;
        int b = 20;
        int c = a * b;
        System.out.println(c);//all methods should be returntype or nonreturntype.You can't mix them

    }

    public static void multiplication(String y, String z) {
        System.out.println(y + z);//+ sign just to understand String data types
    }

    public static void multiplication(double a, double b) {
        double c = a * b;
        System.out.println(c);

    }

    public static int multiplication(int e, int f, int g) {
        int i = e * f * g;
        return i;
    }

        public static void multipliction ( int a, int b){
            System.out.println(a * b);

        }
        public static void multiplication ( int a, int b, int c, int d){
            int e = a * b * c * d;
            System.out.println(e);
        }


        public static void main (String[]args){
            multiplication(1, 2, 3,4 );
            multiplication(2, 3);
            multiplication(1.2, 1.2);
            MyPolymorphismClassOverloading myPolymorphismClass = new MyPolymorphismClassOverloading();
            myPolymorphismClass.multiplication();
            multiplication("Shital ", "Dalal");
            System.out.println(myPolymorphismClass.multiplication(2, 3, 4));
        }


    }
