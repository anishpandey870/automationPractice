package org.example.fileHandling.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class jsonMain {
    public static void main(String[] args) throws IOException {
        File file=new File(".\\newFileData\\employee.json");
        ObjectMapper objectMapper=new ObjectMapper();
        //read the json data from file and map the employee
      Employee employee=  objectMapper.readValue(file,Employee.class);
      //access data
        System.out.println("first name: "+employee.getFirstName());
        System.out.println("last name: "+employee.getLastName());
        for(Address address:employee.getAddress()){
            System.out.println("address :"+address.getStreet());
            System.out.println("address :"+address.getCity());
            System.out.println("address :"+address.getState());

        }

    }
}
