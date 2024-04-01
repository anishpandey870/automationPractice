package org.example.fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        File fr=new File("D:\\newFile.txt");
        try {
            Scanner dataReader=new Scanner(fr);
            while(dataReader.hasNextLine()){
                String fileData=dataReader.nextLine();
                System.out.println(fileData);
            }
            dataReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("unexpected error");
            throw new RuntimeException(e);
        }
    }
}
