package creational.Builder;

import javax.swing.plaf.PanelUI;

public abstract class Builder {
    public int ram;
    int rom;
    int version;
    int chip;
    Float screenSize;
    String processor;
    String brand;

    public abstract LaptopBrand build();

    public Builder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public Builder setRom(int rom) {
        this.rom = rom;
        return this;
    }

    public Builder setVersion(int version) {
        this.version = version;
        return this;
    }

    public Builder setChip(int chip) {
        this.chip = chip;
        return this;
    }

    public Builder setScreenSize(Float screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public Builder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public int getRam() {
        return this.ram;
    }

    public int getRom() {
        return rom;
    }

    public int getVersion() {
        return version;
    }

    public int getChip() {
        return chip;
    }

    public Float getScreenSize() {
        return screenSize;
    }

    public String getProcessor() {
        return processor;
    }

    public String getBrand() {
        return brand;
    }

    public Builder setBrand(String brand) {
        this.brand = brand;
        return this;
    }
}
