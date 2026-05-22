package classes;

import interfaces.Flyweight;

public class Tree implements Flyweight {
    private final int id;
    private int size;
    private int leafs;
    private String species;
    
    public Tree(int id, int size, int leafs, String species) {
        this.id = id;
        this.size = size;
        this.leafs = leafs;
        this.species = species;
    }

    public int getId() {
        return id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getLeafs() {
        return leafs;
    }

    public void setLeafs(int leafs) {
        this.leafs = leafs;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
