package creational.Builder;

public class Director {
    public Director(){
        LaptopBrand delllaptop = new DelllaptopBuilder().setRam(16).setRom(34).setChip(2).setBrand("dell").build();
        delllaptop.toString();

        LaptopBrand macLaptop = new MacLaptopBuilder().setRam(16).setRom(34).setChip(2).setBrand("apple").build();
        macLaptop.toString();
    }
}
