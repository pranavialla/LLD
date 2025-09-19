package creational.singleton;
public final class Lazy  {
    private static volatile Lazy lazyThreadSafeInstance = null;
    private int c=0;

    private Lazy() {
        c+=1;
        System.out.println("Lazy instance created "+c+ " times");
    }

    public static Lazy getInstance() {
        if (lazyThreadSafeInstance == null) {
            synchronized (Lazy.class) {
                if (lazyThreadSafeInstance == null) {
                    lazyThreadSafeInstance = new Lazy();
                }
            }
        }
        return lazyThreadSafeInstance;
    }

}
