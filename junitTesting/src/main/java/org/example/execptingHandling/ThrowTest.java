package org.example.execptingHandling;

public class ThrowTest {
    public static void validate(int age){
        if(age<18){
            throw new RuntimeException("not eligibale for vote");//unchecked execption
        }else{
            System.out.println("eligibale for vote");
        }
    }
    public static void main(String[] args) {
        ThrowTest.validate(13);
    }
}
