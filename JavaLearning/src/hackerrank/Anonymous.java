package hackerrank;

public interface Anonymous {
 void show();
 //int printNum(int x,int y);
 public static void num() {
	 System.out.println("method first");
 }
 public default void prints() {
	 System.out.println("methos second");
 }
 
}


