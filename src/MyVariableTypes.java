public class MyVariableTypes {
    int a = 5; // global or instance variable(outside method and inside the class)
    static int b = 4; //static or class variable(same as global with static keyword )

    public static void main(String[] args) {
        int c = 12;/*local variable- declared inside the method only and used for that method
                    only*/
        MyVariableTypes myObject = new MyVariableTypes();
        System.out.println(myObject.a);
        System.out.println(b);
        System.out.println(c-b);
        System.out.println(c- myObject.a);


    }
}
