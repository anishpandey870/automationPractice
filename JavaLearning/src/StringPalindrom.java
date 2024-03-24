import java.util.*;
public class StringPalindrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		String rev="";
		String temp=st;
		for(int i=st.length()-1;i>=0;i--)
		{
			 rev=rev+st.charAt(i);
		}
		if(temp==st)
		System.out.println(rev+"--->"+"palindrom");
		else
			System.out.println(rev+"+---->"+"not palindrom");

	}

}
