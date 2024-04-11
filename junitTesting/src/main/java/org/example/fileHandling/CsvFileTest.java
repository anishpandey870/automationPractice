package org.example.fileHandling;

import java.io.*;
import java.util.Scanner;

public class CsvFileTest {

    //write csv file
    public static void writeCsvFile(String filePath) {
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.append("Name,email,id \n");
            fileWriter.append("Suresh,surag@gmail.com,25 \n");
            fileWriter.append("Kumar,kumar@gmail.com,26 \n");
            fileWriter.append("Aman,aman@gmail.com,27 \n");
            fileWriter.close();
            System.out.println("cvs file created at :" + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //read csv file using scanner
    public static void readCsvFile(String filePath) {
        File read = new File(filePath);
        try {
            Scanner sc = new Scanner(read);
            sc.useDelimiter(",");
            while (sc.hasNext()) {
                System.out.print(sc.next() + "\t");
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //read csv file using split method
    public static void readCSv(String filePath) {
        try {
            FileReader reader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                for (String value : data) {
                    System.out.print(value + "\t");
                }
                System.out.println();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    public static void main(String[] args) throws IOException {
        String csvFilePath = System.getProperty("user.dir") + "\\newFileData\\csvFileExample.csv";
     //write csv
        writeCsvFile(csvFilePath);
       //read csv file using scanner class
       readCsvFile(csvFilePath);
        //read csv file using split method
       readCSv(csvFilePath);
    }

}
