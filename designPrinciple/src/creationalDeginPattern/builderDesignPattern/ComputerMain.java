package creationalDeginPattern.builderDesignPattern;

public class ComputerMain {

    public static void main(String[] args) {
       // Using the Builder to create a Computer object
        Computer computer = new Computer.ComputerBuilder()
                .setCpu("Intel Core i7")
                .setGpu("NVIDIA GeForce RTX 3080")
                .setRamSize(16)
                .setStorageSize(512)
                .build();

        // Accessing properties of the Computer object
        System.out.println("CPU: " + computer.getCpu());
        System.out.println("GPU: " + computer.getGpu());
        System.out.println("RAM Size: " + computer.getRamSize() + "GB");
        System.out.println("Storage Size: " + computer.getStorageSize() + "GB");
    }
}
