package interfaces;

public interface ITreeFactory {
    IFlyweightTree create(int size, int leafs, String species);
}
