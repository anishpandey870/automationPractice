package hackerrank;


public class Test {

	public static int getData( String s ,char c){
        int res =0;
         for(int i=0;i<s.length();i++){
	        if(s.charAt(i)==c){
	            res++;
	        }
	        }
         
	        return res;
    }
   
	public static void main(String[] args) {
	    String st="MINIMUM";
	    char c= 'M';
		System.out.println(getData(st,c));
	}
}
