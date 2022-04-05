package creational.builder.computer;

public class Computer {
    String CPU, RAM, Disk, screen, GPU;
    public Computer(Builder builder){
        this.CPU = builder.CPU;
        this.Disk = builder.Disk;
        this.RAM = builder.RAM;
        this.screen = builder.screen;
        this.GPU = builder.GPU;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", Disk='" + Disk + '\'' +
                ", screen='" + screen + '\'' +
                ", GPU='" + GPU + '\'' +
                '}';
    }
    public static class Builder{
        String CPU, RAM, Disk, screen, GPU;
        public Builder addCPU(String CPU){
            this.CPU = CPU;
            return this;
        }
        public Builder addRAM(String RAM){
            this.RAM = RAM;
            return this;
        }
        public Builder addDisk(String Disk){
            this.Disk = Disk;
            return this;
        }
        public Builder addScreen(String screen){
            this.screen = screen;
            return this;
        }
        public Builder addGPU(String GPU){
            this.GPU = GPU;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }
}
