package org.example.execptingHandling;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExecption {
    public static void getValue()throws FileNotFoundException {
      FileReader file =new FileReader("d:\\newFile.txt");
        BufferedReader bufferedReader=new BufferedReader(file);
        throw new FileNotFoundException();
    }

    public static void main(String[] args) {
        try{
            getValue();
        }catch (FileNotFoundException e){
            System.out.println(e);
        }

    }
}
