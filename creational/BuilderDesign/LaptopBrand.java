package creational.Builder;

public abstract class LaptopBrand {
    protected final int ram;
    protected final int rom;
    protected final int version;
    protected final int chip;
    protected final Float screenSize;
    protected final String processor;
    protected final String brand;

    protected LaptopBrand(Builder<?> builder) {
        this.ram = builder.ram;
        this.rom = builder.rom;
        this.version = builder.version;
        this.chip = builder.chip;
        this.screenSize = builder.screenSize;
        this.processor = builder.processor;
        this.brand = builder.brand;
    }

    @Override
    public String toString() {
        return "LaptopBrand{" +
                "ram=" + ram +
                ", rom=" + rom +
                ", version=" + version +
                ", chip=" + chip +
                ", screenSize=" + screenSize +
                ", processor='" + processor + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
