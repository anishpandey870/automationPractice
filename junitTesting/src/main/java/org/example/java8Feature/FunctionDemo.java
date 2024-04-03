package org.example.java8Feature;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}
public class FunctionDemo {
    public static void main(String[] args) {
        ArrayList<Employee> emp=new ArrayList<>();
        emp.add(new Employee("Raju",40000));
        emp.add(new Employee("Suman",20000));
        emp.add(new Employee("Aman",30000));
        Function<Employee,Integer> fn=e ->{
            int sal=e.salary;
            if(sal>=10000 && sal<=20000){
                return (sal*10/100);
            }else if(sal>=20000 && sal<=30000){
                return (sal*20/100);
            }else{
                return (sal*30/100);
            }
        };
        Predicate<Integer> p=b->b>2000;
        Consumer<Employee> c=em->{
            System.out.println(em.name);
            System.out.println("This salary : "+em.salary);
        };
        for(Employee ep:emp){
            int bonus=fn.apply(ep);
            if(p.test(bonus)) {
                c.accept(ep);
               // System.out.println(ep.name + " " + ep.salary);
                System.out.println("this bonus :" + bonus);
            }
        }

    }
}
