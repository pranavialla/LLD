package structural.Flyweight;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Immutable, thread-safe Flyweight implementation
public final class Flyweight {
    private final Map<Character, Character> cache;

    // Shared instance for flyweight (optional, for global sharing)
    private static final Flyweight INSTANCE = new Flyweight();

    private Flyweight() {
        // Use a synchronized map for thread safety
        this.cache = Collections.synchronizedMap(new HashMap<>());
    }

    public static Flyweight getInstance() {
        return INSTANCE;
    }

    // Returns a shared immutable Character object for the given character
    public Character getObjectRefForACharacter(Character aCharacter) {
        synchronized (cache) {
            if (!cache.containsKey(aCharacter)) {
                cache.put(aCharacter, aCharacter);
            }
            return cache.get(aCharacter);
        }
    }
}
