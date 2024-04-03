package org.example.execptingHandling;
class UserException extends Exception{
   public UserException(String str){
       //calling constructor of parent exception
       super(str);
   }
}
public class UserDefineException {
    public static void main(String[] args) {
            try {
                throw new UserException("this user exception");
            } catch (UserException e) {
              System.out.println("caught exception");
                System.out.println(e.getMessage());
            }


    }
}
