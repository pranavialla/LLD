package creational.singleton;
public class Eager  {
    private static Eager instance = new Eager();
    private int c=0;
    private Eager() {
        c+=1;
        System.out.println("Eager created "+c+ " times");
    }

    public static Eager getInstance() {
        return instance;
    }

}
