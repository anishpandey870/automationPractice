package org.example.regex;

import java.util.Scanner;

public class UserNameValidatorMain {
    public static void main(String[] args) {
        UserNameValidator uv = new UserNameValidator();
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String pNumber = sc.nextLine();
        String email = sc.nextLine();

            if (uv.nameValidate(name) == true) {
                System.out.println("this is vaild name :" + name);
            } else {
                System.out.println("this is invaild name :" + name);
            }
            if (uv.phoneValidate(pNumber) == true) {
                System.out.println("this is vaild name :" + pNumber);
            } else {
                System.out.println("this is invaild name :" + pNumber);
            }
            if (uv.emailValidate(email) == true) {
                System.out.println("this is vaild email :" + email);
            } else {
                System.out.println("this is invaild email :" + email);
            }

    }
}
