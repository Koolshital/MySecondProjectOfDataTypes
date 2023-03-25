package com.accessmodifier1;
public class StringPredefineMethods {
    public static void main(String[] args) {
        String myAddress = "100 London Road";
        String myTown = " Billericay";
        String myPostcode =" AB12 3CD";
        String myPassword = "fan tan ";
        System.out.println(myAddress.length());
        System.out.println(myTown.toUpperCase());
        System.out.println(myAddress.concat(myTown+myPostcode));
        System.out.println(myAddress.contains("Road"));
        System.out.println(myTown.equals(myPostcode));
        System.out.println(myPostcode.compareTo(myAddress));
        System.out.println(myTown.replace("Billericay","Shenfield"));
        StringBuffer stringBuffer =new StringBuffer(myTown);//need to create stringbuffer object to use  reverse() method
        System.out.println(stringBuffer.reverse());
        System.out.println(myPassword.contains("an"));




    }
}
