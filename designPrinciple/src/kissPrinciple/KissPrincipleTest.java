package kissPrinciple;

public class KissPrincipleTest {
    public static double calAverage(int ar[]){
        if(ar.length==0 || ar==null){
            return 0.0;
        }
        int sum=0;
        for(int i=0;i<ar.length;i++){
            sum=sum+ar[i];
        }
        double avg=sum/ar.length;
        return avg;
    }


    public static void main(String[] args) {
    int ar[]={2,3,4};
   System.out.println( calAverage(ar));
    }
}
