public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        satiety = plate.decreaseFood(appetite);
    }

    public void infoCat() {
        if (satiety) {
            System.out.println(String.format("Кот %s наелся", name));
        } else {
            System.out.println(String.format("Кот %s остался голодным", name));
        }
    }
}
