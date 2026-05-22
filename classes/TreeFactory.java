package classes;

import java.util.HashMap;
import java.util.Map;

import interfaces.ITreeFactory;
import interfaces.IFlyweightTree;

public class TreeFactory implements ITreeFactory {

    private final Map<String, IFlyweightTree> pool = new HashMap<>();

    private String hashFunction(int size, int leafs, String species) {
        return size + "_" + leafs + "_" + species;
    }

    @Override
    public IFlyweightTree create(int size, int leafs, String species) {
        String hash = hashFunction(size, leafs, species);
        IFlyweightTree tree = pool.get(hash);
        if (tree == null) {
            tree = new Tree(size, leafs, species);
            pool.put(hash, tree);
        }
        return tree;
    }
}
