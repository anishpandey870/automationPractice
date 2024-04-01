package org.example.fileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args)  {
        try {
            //here fc created for specify the directory path
            File fc = new File("D:\\newFile.txt");
            //createNewFile() used to create new file
            if (fc.createNewFile()) {
                System.out.println("file" + fc.getName() + "is created successfully.");
            } else {
                System.out.println("file already existed");
            }
        }catch (IOException e){
            System.out.println("unexcepted error");
            e.printStackTrace();
        }
    }
}
