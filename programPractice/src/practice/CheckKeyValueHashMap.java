package practice;

import java.util.HashMap;
import java.util.Map;

//How do you check whether a particular key/value exist in hashmap
public class CheckKeyValueHashMap {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("apple",80);
        map.put("mango",50);
        map.put("grapes",60);

        String keyCheck="mango";
        if(map.containsKey(keyCheck)){
            System.out.println("found key :"+keyCheck);
        }else {
            System.out.println("not found");
        }

        int valueCheck=50;
        if(map.containsValue(valueCheck)){
            System.out.println("found value :"+valueCheck);
        }else {
            System.out.println("not found");
        }
    }
}
