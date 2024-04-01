package org.example.fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter fw=new FileWriter("D:\\newFile.txt");
            //writing content in file
            fw.write("this my secand line which I am writing from write method");
            //close the steam
            fw.close();
        } catch (IOException e) {
            System.out.println("unexpected error");
            e.printStackTrace();
        }
    }
}
