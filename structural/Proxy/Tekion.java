package structural.Proxy;

public class Tekion implements Server{

    @Override
    public void call(String string) {
        System.out.println("called tekion with required auth");
    }
}
