package practice;
// nth Harmonic Number
public class HarmonicNumber {
    public static double checkHarmonic(int n){
        double harmonic=0;
        for(int i=1;i<=n;i++){
            harmonic+=1.0/i;
        }
        return harmonic;
    }

    public static void main(String[] args) {
        int n=5;
        double har=checkHarmonic(n);
        System.out.println("this is nth harmonic number :"+har);
    }
}
