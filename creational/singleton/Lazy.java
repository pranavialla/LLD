package creational.singleton;
public class Lazy  {
    private static Lazy lazyThreadSafeInstanc = null;
    private int c=0;

    private Lazy() {
        c+=1;
        System.out.println("Lazy instance created "+c+ " times");
    }

    public static Lazy createLazySingletonThreadSafeInstance() {
        if (lazyThreadSafeInstanc == null) {
            synchronized (Lazy.class) {
                if (lazyThreadSafeInstanc == null) {
                    lazyThreadSafeInstanc = new Lazy();
                    return lazyThreadSafeInstanc;
                }
            }
        }
        return lazyThreadSafeInstanc;
    }
}
