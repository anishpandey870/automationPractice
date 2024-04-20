package practice;

public class AvgNumAtEvenPlace {
    public static int evenAvg(int n){
        int avg,sum=0,count=0;
       while (n>0){
           if(n%2==0){
               sum=sum+n;
               count++;
           }
           n--;
       }
       avg=sum/count;
     return avg;
    }

    public static void main(String[] args) {
        int n=5;
      int res= evenAvg(n);
        System.out.println(res);
    }

}
