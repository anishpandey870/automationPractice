import java.util.*;
public class CountCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		//String st="rama jaja";
		int count=0;
		for(int i=0;i<st.length();i++)
		{
	         if(st.charAt(i)!=' ')
				count++;
	         
		}
       System.out.println(count);
	}

}
