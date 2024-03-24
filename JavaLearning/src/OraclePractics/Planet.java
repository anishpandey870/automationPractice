package OraclePractics;

public class Planet{
	public String name;
	public int moon;
	public Planet(String name,int moon) {
		this.name=name;
		this.moon=moon;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Planet[] planets= {
				new Planet("me", 0),
				new Planet("ve", 0),
				new Planet("earth", 1),
				new Planet("mar", 2),
				
		};
		System.out.println(planets);
		System.out.println(planets[2].name);
		System.out.println(planets[2].moon);
	}

}
