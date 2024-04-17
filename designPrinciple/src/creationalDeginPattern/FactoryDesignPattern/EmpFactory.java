package creationalDeginPattern.FactoryDesignPattern;

public class EmpFactory {
    public static Employee getEmp(String empType){
        if(empType.trim().equalsIgnoreCase("web developer")){
            return new WebDeveloper();
        }else if(empType.trim().equalsIgnoreCase("java developer")){
            return new JavaDeveloper();
        }else {
            return null;
        }

    }
}
