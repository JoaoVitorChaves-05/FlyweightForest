package classes;

import java.util.HashMap;
import java.util.Map;

import interfaces.ITreeFactory;
import interfaces.IFlyweightTree;

public class TreeFactory implements ITreeFactory {

    private final Map<Integer, IFlyweightTree> pool = new HashMap<>();

    private int hashFunction(int size, int leafs, String species) {
        int n = size;
        n = 31 * n + leafs;
        n = 31 * n + species.hashCode();
        return n;
    }

    @Override
    public IFlyweightTree create(int size, int leafs, String species) {
        int hash = hashFunction(size, leafs, species);
        IFlyweightTree tree = pool.get(hash);
        if (tree == null) {
            tree = new Tree(size, leafs, species);
            pool.put(hash, tree);
        }
        return tree;
    }
}
