package OraclePractics;
class MyString{
	String msg;
	public MyString(String msg) {
		// TODO Auto-generated constructor stub
		this.msg=msg;
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("h"+new StringBuilder("java se 8"));
      System.out.println("h"+new MyString("java se 8").msg);
     
	}

}
