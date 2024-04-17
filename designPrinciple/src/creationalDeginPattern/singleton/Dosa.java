package creationalDeginPattern.singleton;

public class Dosa {
    //egar way to create object
    private static Dosa dosa=new Dosa();
    public static Dosa getDosa(){
        return dosa;
    }
}
