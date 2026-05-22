package classes;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    
    private final Map<Integer, Tree> pool = new HashMap<>();

    public Tree create(int id, int size, int leafs, String species) {
        return pool.computeIfAbsent(id, k -> new Tree(k, size, leafs, species));
    }
}
