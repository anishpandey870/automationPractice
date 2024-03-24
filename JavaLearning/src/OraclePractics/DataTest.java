package OraclePractics;

public class DataTest {
	public static void main(String[] args) {
		String  s="rat";
		String t="car";
		if(areAnagram(s,t)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	
	}
	public static boolean areAnagram(String s, String t) {
		if (s.length()!=t.length()) {
			return false;
		}
		int[] charCount =new int[256];
		for(int i=0;i<s.length();i++) {
			charCount[s.charAt(i)]++;
		}
		for(int i=0;i<t.length();i++) {
			charCount[t.charAt(i)]--;
		
		if(charCount[t.charAt(i)]<0) {
			return false;
		}
	}
	return true;

	}
}
