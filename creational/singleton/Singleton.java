package creational.singleton;

import creational.Creational;

public class Singleton implements Creational {
    public Singleton() {
        System.out.println("***********Sinleton Pattern***********");

        Lazy lazy1= Lazy.createLazySingletonThreadSafeInstance();
        Lazy lazy2= Lazy.createLazySingletonThreadSafeInstance();
        Lazy lazy3= Lazy.createLazySingletonThreadSafeInstance();

        Eager eager1= Eager.getInstance();
        Eager eager2= Eager.getInstance();
        Eager eager3= Eager.getInstance();

    }

}
