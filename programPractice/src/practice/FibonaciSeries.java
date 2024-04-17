package practice;

public class FibonaciSeries {
    public static void findFibonaci(int n){
        int a=0;
        int b=1;
        int c;
        for(int i=2;i<=n;i++){
            c=a+b;
           System.out.print(c+" ");
           a=b;
           b=c;
        }

    }

    public static void main(String[] args) {
        int n=10;
        findFibonaci(n);
    }

}
