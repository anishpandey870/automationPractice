package creationalDeginPattern.FactoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        Employee emp = EmpFactory.getEmp("web developer");
        System.out.println(emp);
      int sal=  emp.getSalary();
        System.out.println("salary :" + sal);
        Employee emp2 = EmpFactory.getEmp("java developer");
        int salary=  emp2.getSalary();
        System.out.println("salary :" + salary);

    }
}
