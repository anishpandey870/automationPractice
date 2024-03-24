package OopsPractice;



class Dog {
	private String name;
	private String breed;

	public Dog(String name, String breed) {
		super();
		this.name = name;
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

}

public class DogMain {
	public static void main(String[] args) {
		Dog d1 = new Dog("roni", "street");
		Dog d2 = new Dog("jecky", "german");
		d1.setName("jimmy");
		d1.setBreed("bull dog");
		d2.setName("rocky");
		d2.setBreed("lebra");
		System.out.println(d1.getName() + " " + d1.getBreed());
		System.out.println(d2.getName() + " " + d2.getBreed());

	}
}
