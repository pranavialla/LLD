package creational.Builder;

public class DelllaptopBuilder extends Builder<DelllaptopBuilder> {
    @Override
    protected DelllaptopBuilder self() {
        return this;
    }

    @Override
    public LaptopBrand build() {
        // Example validation
        if (brand == null || processor == null) {
            throw new IllegalStateException("Brand and processor must be set");
        }
        return new DellLaptop(this);
    }
}
