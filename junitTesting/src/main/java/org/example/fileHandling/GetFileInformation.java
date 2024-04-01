package org.example.fileHandling;

import java.io.File;
import java.io.IOException;

public class GetFileInformation {
    public static void main(String[] args) {

            File fi = new File("D:\\newFile.txt");
            if (fi.exists()) {
                //to get the file name.
              System.out.println("file :"+fi.getName());
              //to get absolute path
              System.out.println("file path :"+fi.getAbsolutePath());
              //checking file writable or not
              System.out.println("is file wrietable :"+fi.canWrite());
                //checking file readable or not
              System.out.println("is file readable :"+fi.canRead());
                System.out.println("legth of file in byte :"+fi.length());
            }else{
                System.out.println("file does not exist");
            }

    }
}
