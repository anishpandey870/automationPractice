package creationalDeginPattern.singleton;

public class Samosa {
    // Private static variable to hold the single instance of the class
    private static Samosa samosa;

    // Private constructor to prevent instantiation from outside the class
    private Samosa() {
    }

    //lazy way to creating singleton
    public static Samosa getSamosa() {
        //  object of this class

        if (samosa == null) {
            //this use of single thread at one time
           synchronized (Samosa.class){
               if(samosa==null){
                   samosa = new Samosa();
               }
           }
        }
        return samosa;
    }
}
