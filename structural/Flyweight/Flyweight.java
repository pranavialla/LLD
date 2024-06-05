package structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class Flyweight {
    public Map<Character, Character> cache;
    Flyweight(){
        cache=new HashMap<>();
    }
    Character getObjectRefForACharacter(Character aCharacter){
        if(!cache.containsKey(aCharacter)){
            cache.put(aCharacter, aCharacter);
        }
        return cache.get(aCharacter);
    }
}
