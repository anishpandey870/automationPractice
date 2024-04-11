package org.example.fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileAction {
    //file create
    public static void createFile(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("file created :" + file.getName());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("file already exist :" + file.getName());
        }
    }

    //writing some data inside file
    public static void writeData(String filePath){
        try {
            FileWriter myWriter=new FileWriter(filePath);
            myWriter.write("this my first file which I ahve creating now");
            myWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("data write successfully ");
    }

    //reading data from file
    public static void readFile(String filePath){
        File readFile=new File(filePath);
        try {
            Scanner read=new Scanner(readFile);
            while(read.hasNextLine()){
                String myread=read.nextLine();
                System.out.println(myread);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException("file not found to read : "+e);
        }
    }

    public static void renameFile(String oldFilePath,String newFilePath){
        File oldPath=new File(oldFilePath);
        File newPath=new File(newFilePath);
        if(oldPath.renameTo(newPath)){
            System.out.println("file rename successfully");
        }else{
            System.out.println("file not rename successfully");
        }
    }


    public static void main(String[] args) {
        String filePath = "D:\\myNewFile\\abc.txt";
        String newFilePath="D:\\myNewFile\\xyz.txt";
      //  createFile(filePath);
       // writeData(filePath);
       // readFile(filePath);
        renameFile(filePath,newFilePath);
    }
}
