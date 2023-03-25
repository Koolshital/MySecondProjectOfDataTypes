public class MyArrayClassD {
    public static void main(String[] args) {
        String[] flowerNames ={"Rose","Lotus","Jasmine","Daffodil","Tulip","Lily"};
        for (String flower:flowerNames){//list done by foreach loop
            System.out.println(flower);}

       for (int i=0;i<flowerNames.length;i++){//list done by for loop
           System.out.println(flowerNames[i]);}
            for(int f=flowerNames.length-1;f>=0;f--){//list printed in reverse order by for loop
                System.out.println(flowerNames[f]);
            }
}}
