package structural.Composite;

public class File implements FilesSystem {
    FilesSystem fileComponent;
    String name;
    File(String name){
        this.name=name;
    }
    @Override
    public void render() {
        System.out.println("render file : "+this.name);
    }
}
