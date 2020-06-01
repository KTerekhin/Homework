public class Animal {
    protected String name;
    protected int maxRun, maxSwim;

    public Animal(String name) {
        this.name = name;
    }

    public void run(int distance) {
        System.out.println("Животное бежит");
    }

    public void swim(int distance){
        System.out.println("Животное плавает");
    }
}
