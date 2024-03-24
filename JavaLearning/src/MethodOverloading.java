
public class MethodOverloading {
	
	static int max(int x,int y)
	{
		return x>y?x:y;
	}
	static float max(float x,float y)
	{
		return x>y?x:y;
	}
	static String max(int x, String y)
	{
		return  y;
	}

	public static void main(String[] args) {
       //float a=0.2f,b=.3f;
       String name="anish";
       int a=5;
       System.out.println(max(a,name));
	}

}
