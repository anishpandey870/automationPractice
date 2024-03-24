import java.util.*;
public class StrPalindromCheck {
	
	public static boolean isPalindrom(String st)
	{
		int i=0, j=st.length()-1;
		while(j>i)
		{
			if(st.charAt(i)!=st.charAt(j))
			{
				return false;	
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		boolean rs=isPalindrom(st);
		if(rs)
			System.out.println("its Palindrom");
		else
			System.out.println("it not palindrom");
	}
}
