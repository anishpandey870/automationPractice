
public class MethodCall {
	static   int max(int x,int y)
	  {
		  if(x>y)
			  return x;
		  else
			  return y;
	  }

	public static void main(String[] args) {
		int x=40,y=20;
		int rs= max(x,y);
		System.out.println(rs);
	}

}
