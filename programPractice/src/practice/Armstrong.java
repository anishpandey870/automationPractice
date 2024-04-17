package practice;

public class Armstrong {
    public static int power(int base,int expo){
        int res=1;
        for (int i=1;i<=expo;i++){
            res=base*res;
        }
        System.out.println(res);
        return res;
    }


    public static boolean isArmstrong(int n){
        int temp=n;
       int numDigit=String.valueOf(n).length();
        int sum=0;
        while (n>0){
            int rem=n%10;
            sum+=Math.pow(rem,numDigit);

            n=n/10;
        }
        if(temp==sum)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int n=153;
        System.out.println(isArmstrong(n));
        int a=2,b=3;
        power(a,b);
    }
}
