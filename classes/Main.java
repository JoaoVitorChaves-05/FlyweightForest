package classes;

public class Main {
    public static void main(String[] args) {
        TreeFactory treeFactory = new TreeFactory();

        System.out.println(treeFactory.create(10, 100, "Oak").render(1));
        System.out.println(treeFactory.create(15, 150, "Pine").render(2));
        System.out.println(treeFactory.create(20, 200, "Maple").render(3));

        // Reusing the same tree (Oak, Pine, Maple) to demonstrate flyweight pattern
        System.out.println(treeFactory.create(10, 100, "Oak").render(4));
        System.out.println(treeFactory.create(15, 150, "Pine").render(5));
        System.out.println(treeFactory.create(20, 200, "Maple").render(6));
        System.out.println(treeFactory.create(10, 100, "Oak").render(7));
    }
}