package OopsPractice;

public class Person {
 String name ;
 int age;
 
 public Person(String name, int age) {
	
	this.name = name;
	this.age = age;
}

public static void main(String[] args) {
	Person p1=new Person("Rama",34);
	Person p2=new Person("Suraj",21);
	
	System.out.println(p1.name+" "+p1.age);
	System.out.println(p2.name+" "+p2.age);
}
}
