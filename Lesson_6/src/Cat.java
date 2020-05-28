public class Cat extends Animal {
    public Cat(String name) {
        super(name);
        this.maxRun = 200;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRun) System.out.println(String.format("%s пробежал %s метров", name, distance));
        else System.out.println(String.format("%s не может так далеко бегать", name));
    }

    @Override
    public void swim(int distance) {
        System.out.println(String.format("%s не умеет плавать", name));

    }
}
