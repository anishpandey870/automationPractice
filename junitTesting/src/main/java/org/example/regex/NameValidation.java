package org.example.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameValidation {
    public static void main(String[] args) {
       // String[] nameArray={"Raju","suman","Anish","Akhil4"};
        String number ="9799791798";
//      for(String name:nameArray){
//          if(isValid(name)==true){
//              System.out.println(name+">>"+"valid");
//          }else{
//              System.out.println(name+">>"+"invalid");
//          }
//      }

            if(isValidNum(number)==true){
                System.out.println(number+">>"+"valid");
            }else{
                System.out.println(number+">>"+"invalid");
            }

    }
//    public static boolean isValid(String name){
//        return name.matches("[a-zA-Z]+");//using regex only letter allowed
//    }
    public static boolean isValidNum(String number){
        return number.matches("^\\+\\d{1,2}[\\s]\\d{10}$|^\\d{10}$");//using regex only letter allowed
    }

}
