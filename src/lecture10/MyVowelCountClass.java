package lecture10;

public class MyVowelCountClass {
    public static void main(String[] args) {
        String name = "Shital Dalal is a Good QA";
        name = name.toLowerCase();//converting all letters in lower case
        int vowel = 0;
        int consonant = 0;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'){//check if char[i] is vowel
                vowel++;// increment in number if char(i) is vowel
            } else if (name.charAt(i)==' ') {
            } else {
                consonant++;
            }

        }
        System.out.println("The total number of vowels are " + vowel);// calling  for total number of vowels

        System.out.println( "The total number of consonants are " + consonant);

}}
