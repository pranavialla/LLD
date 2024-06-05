package creational.Builder;

public class MacLaptopBuilder extends Builder {



    @Override
    public Builder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public   LaptopBrand build(){
        return new MacLaptop(this);
    }

}
