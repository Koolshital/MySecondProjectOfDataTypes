package lecture10;public class MyTriangleTypes  {
    public void findTypesOfTriangle(int a,int b,int c){
        if(a==b && b==c){
            System.out.println("This is Equilateral Triangle");
        }else if(a==b || b==c || a==c){
            System.out.println("This is  Isosceles Triangle");
        }else {
            System.out.println("This is Scalene Triangle");
        }
    }
    public static void main(String[] args) {
        //Equilateral tri = 3 sides same
        //Isosceles tri = 2 sides same
        //Scalene = no sides same
        MyTriangleTypes myTriangleTypes = new MyTriangleTypes();
      myTriangleTypes.findTypesOfTriangle(23,34,34);
      myTriangleTypes.findTypesOfTriangle(34,34,34);
      myTriangleTypes.findTypesOfTriangle(12,23,45);
    }
}
