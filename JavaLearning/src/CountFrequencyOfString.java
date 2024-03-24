import java.util.*;
public class CountFrequencyOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		int count[]=new int[128];
		//st=st.toLowerCase();
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			count[ch]++;
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
				System.out.println((char)i+"---->"+count[i]);
		}
	}

}
