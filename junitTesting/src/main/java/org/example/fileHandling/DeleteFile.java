package org.example.fileHandling;

import java.io.File;
import java.lang.reflect.Field;

public class DeleteFile {
    public static void main(String[] args) {
        File fd=new File("D:\\newFile.txt");
        if(fd.delete()){
            System.out.println("file"+fd.getName()+" successfully deleted");
        }else {
            System.out.println("file not exist");
        }
    }
}
