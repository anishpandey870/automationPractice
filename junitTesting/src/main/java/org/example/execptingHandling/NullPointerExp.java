package org.example.execptingHandling;

public class NullPointerExp {
    public static void main(String[] args) {
        String str=null;
        try {
            if(str.equals("abc")){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}
