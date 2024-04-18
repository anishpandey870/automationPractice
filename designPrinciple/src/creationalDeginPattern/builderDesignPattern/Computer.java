package creationalDeginPattern.builderDesignPattern;

// Computer class with complex construction process
public class Computer {
    private String cpu;
    private String gpu;
    private int ramSize;
    private int storageSize;

    // Private constructor to force the usage of Builder

    private Computer(String cpu, String gpu, int ramSize, int storageSize) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
    }

   // Getter methods

    public String getCpu() {
        return cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public int getRamSize() {
        return ramSize;
    }

    public int getStorageSize() {
        return storageSize;
    }

    static class ComputerBuilder {
        private String cpu;
        private String gpu;
        private int ramSize;
        private int storageSize;

        public ComputerBuilder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public ComputerBuilder setRamSize(int ramSize) {
            this.ramSize = ramSize;
            return this;
        }

        public ComputerBuilder setStorageSize(int storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        // Build method to create the Computer instance
        public Computer build() {
            return new Computer(cpu, gpu, ramSize, storageSize);
        }
    }

}
