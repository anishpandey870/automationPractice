package practice;

public class GCDTest {
    public static int findGCD(int a,int b){
        while( b!=0){
            int rem=b;
            b=b%a;
            a=rem;
        }
        return a;
    }

    //GCD using for loop
    public static int gdc(int a,int b){
        int gcd=0;
        for (int i=1;i<=b;i++){
            if(a%i==0 && b%i==0){
               gcd=i;
            }
        }
        return gcd;
    }
    public static int findLCM(int a,int b,int gcd){
        return (a*b)/gcd;
    }

    public static void main(String[] args) {

        int a=50,b=60;
        //int gcd=findGCD(a,b);
        int gcd=gdc(a,b);
        int lcm=findLCM(a,b,gcd);
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
