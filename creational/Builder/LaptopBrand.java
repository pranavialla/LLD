package creational.Builder;

public abstract class LaptopBrand {
    int ram;
    int rom;
    int version;
    int chip;
    Float screenSize;
    String processor;
    String brand;
    LaptopBrand(Builder builder) {
        this.ram = builder.ram;
        this.rom = builder.rom;
        this.version = builder.version;
        this.chip = builder.chip;
        this.screenSize = builder.screenSize;
        this.processor = builder.processor;
        this.brand = builder.brand;
        System.out.println("inside laptop builder");
    }

    public String toString() {
        System.out.println("Ram: " + ram);
        System.out.println("Rom: " + rom);
        System.out.println("Version: " + version);
        System.out.println("Chip: " + chip);
        System.out.println("Screen Size: " + screenSize);
        System.out.println("Processor: " + processor);
        System.out.println("Brand: " + brand);
        return null;
    }
}
