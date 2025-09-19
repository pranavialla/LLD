package creational.Builder;

import javax.swing.plaf.PanelUI;

public abstract class Builder<T extends Builder<T>> {
    protected int ram;
    protected int rom;
    protected int version;
    protected int chip;
    protected Float screenSize;
    protected String processor;
    protected String brand;

    public T setRam(int ram) {
        this.ram = ram;
        return self();
    }

    public T setRom(int rom) {
        this.rom = rom;
        return self();
    }

    public T setVersion(int version) {
        this.version = version;
        return self();
    }

    public T setChip(int chip) {
        this.chip = chip;
        return self();
    }

    public T setScreenSize(Float screenSize) {
        this.screenSize = screenSize;
        return self();
    }

    public T setProcessor(String processor) {
        this.processor = processor;
        return self();
    }

    public T setBrand(String brand) {
        this.brand = brand;
        return self();
    }

    protected abstract T self();

    public abstract LaptopBrand build();
}
