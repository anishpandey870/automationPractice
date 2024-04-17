package practice;

public class FactorialTest {
    public static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
       // System.out.println(fact);
    }

    public static void main(String[] args) {
        int n=5;
        int res=fact(n);
        System.out.println(res);
    }
}
