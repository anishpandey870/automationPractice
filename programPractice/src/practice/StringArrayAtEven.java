package practice;
//Print String Present at Even Locations in Array
public class StringArrayAtEven {
    public static void stringAtEvenLocation(String  ar[]){
        for(int i=0;i<ar.length;i++){
             if(i%2==0){
                 System.out.print(ar[i]+" ");
             }
        }
    }
    public static void main(String[] args) {
        String ar[]={"Suman","Aman","Tonny","Vijoy","Raghu"};
        stringAtEvenLocation(ar);
    }
}
