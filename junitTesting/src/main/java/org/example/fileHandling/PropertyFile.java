package org.example.fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Properties;
import java.util.Set;

public class PropertyFile {
    public static Properties properties = new Properties();

    //write the properties
    public static void writeProperties(String filePath) {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            properties.store(fileOutputStream, "Sample data in properties file");
            fileOutputStream.close();
            System.out.println("propreties have been written into :" + filePath);
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    //read properties
    public static void readProperties(String filePath) throws IOException {
        //read the proprerties file
        FileInputStream fileInputStream = new FileInputStream(filePath);
        properties.load(fileInputStream);
        fileInputStream.close();
        String name = properties.getProperty("name");
        String email = properties.getProperty("email");
        String id = properties.getProperty("id");
        System.out.println(name + " " + email + " " + id);
    }

    public static void main(String[] args) throws IOException {

        properties.setProperty("name", "Raju");
        properties.setProperty("email", "raju@gmail.com");
        properties.setProperty("id", "555");
        String filePath = System.getProperty("user.dir") + "\\newFileData\\fileExample.properties";
        //write properties
      //  writeProperties(filePath);
        //read the proprerties file
        readProperties(filePath);
        //capture all key
        Set<String> key=properties.stringPropertyNames();
        System.out.println(key);
    }

}
