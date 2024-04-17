package dryDesignPrinciple;

public class DryPrincipleTest1 {
    public void collage() {
        System.out.println("Bangaolre institute");
    }

    public void CSE() {
        System.out.println("this is CSE branch");
        collage();// Calling method
    }

    public void IT() {
        System.out.println("this is IT branch");
        collage();
    }

    public void ECE() {
        System.out.println("this is ECE branch");
        collage();
    }

    public static void main(String[] args) {
        DryPrincipleTest1 dry = new DryPrincipleTest1();
        dry.CSE();
        dry.IT();
        dry.ECE();
    }

}
