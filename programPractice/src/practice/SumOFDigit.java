package practice;

public class SumOFDigit {
    public static int getSumOfDigit(int n){
        int sum=0;
        while (n>0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n=23;
        System.out.println(getSumOfDigit(n));
    }
}
