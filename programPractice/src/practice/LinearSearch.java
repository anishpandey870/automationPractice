package practice;

public class LinearSearch {
    public static int linearSearch(int[] ar,int target){
        for(int i=0;i<ar.length;i++){
            if(ar[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5,6};
        int target=3;
        int index=linearSearch(ar,target);
        if(index !=-1)
        System.out.println("element :"+target+" found at "+ index);
        else
            System.out.println("not found");
    }
}
