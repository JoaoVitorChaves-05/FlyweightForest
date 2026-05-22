package classes;

import interfaces.IFlyweightTree;

public class Tree implements IFlyweightTree {
    private final int size;
    private final int leafs;
    private final String species;

    public Tree(int size, int leafs, String species) {
        this.size = size;
        this.leafs = leafs;
        this.species = species;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int getLeafs() {
        return leafs;
    }

    @Override
    public String getSpecies() {
        return species;
    }

    @Override
    public String render(int id) {
        return "Tree " + id + ": " + species + ", Size: " + size + ", Leafs: " + leafs;
    }
}
