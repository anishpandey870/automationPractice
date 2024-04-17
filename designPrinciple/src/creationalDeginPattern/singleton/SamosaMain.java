package creationalDeginPattern.singleton;

public class SamosaMain {
    public static void main(String[] args) {
        //for lazy
        Samosa samosa1=Samosa.getSamosa();
        System.out.println(samosa1.hashCode());
        Samosa samosa2=Samosa.getSamosa();
        System.out.println(samosa2.hashCode());
        //for egar
        Dosa dosa1=Dosa.getDosa();
        System.out.println(dosa1.hashCode());
        Dosa dosa2=Dosa.getDosa();
        System.out.println(dosa2.hashCode());
    }
}
