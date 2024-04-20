package practice;
//Check Number is Positive or Negative

public class CheckNumPositOrNeg {
    public static void postiveOrNegativeCheck(int n){
        if(n<0){
            System.out.println("NUmber negative :"+n);
        }else {
            System.out.println("Numerber is positive :"+n);
        }

    }

    public static void main(String[] args) {
        int n= 10;
        postiveOrNegativeCheck(n);
    }
}
