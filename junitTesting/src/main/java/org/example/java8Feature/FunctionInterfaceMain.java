package org.example.java8Feature;
@FunctionalInterface
interface Sayable{
    void say(String msg);

}

public class FunctionInterfaceMain implements Sayable {
    public void say(String msg){
        System.out.println(msg);
    }
    public static void main(String[] args) {
        FunctionInterfaceMain f=new FunctionInterfaceMain();
        f.say("hello and hi");
    }
}
