public class Dog extends Animal {
    public Dog(String name) {
        super(name);
        this.maxRun = 500;
        this.maxSwim = 10;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRun) System.out.println(String.format("%s пробежал %s метров", name, distance));
        else System.out.println(String.format("%s не может так далеко бегать", name));
    }

    @Override
    public void swim(int distance) {
        if (distance <= maxSwim) System.out.println(String.format("%s проплыл %s метров", name, distance));
        else System.out.println(String.format("%s не может так далеко плавать", name));
    }
}
