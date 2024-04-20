package practice;

import java.util.HashSet;
import java.util.Set;

//how can you use a HashSet to find duplicate elements in an array?
public class ArrayDuplicate {
    public static void duplicate(int ar[]){
        Set<Integer> set=new HashSet<>();
        Set<Integer> duplicate=new HashSet<>();
        for(int num:ar){
            if(!set.add(num)){
                duplicate.add(num);
            }
        }
        if(duplicate.isEmpty()){
            System.out.println("not found");
        }else {
            System.out.println("duplicate found :"+ duplicate);
        }
    }

    public static void main(String[] args) {
        int[] ar={1,2,3,2,4,3,5,6,9,5};
        duplicate(ar);
    }
}
