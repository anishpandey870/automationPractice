package org.example.java8Feature;
interface Addition{
    abstract int add(int a,int b);
}

public class LamdaMain {
    public static void main(String[] args) {
//        Addition a=new Addition() {
//            @Override
//            public int add(int a, int b) {
//                return a+b;
//            }
//        } ;
//        int res=a.add(2,3);
//        System.out.println(res);

        //without return keyword
        Addition ad=(int a,int b) -> a+b;
        //with return keyword
//        Addition ad=(int a,int b) ->{
//            return a+b;
//        };
      int res=  ad.add(3,4);
        System.out.println(res);
    }
}
