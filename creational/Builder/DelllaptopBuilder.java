package creational.Builder;

public class DelllaptopBuilder extends Builder{
    @Override
    public Builder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public   LaptopBrand build(){
        return new DellLaptop(this);
    }
}
