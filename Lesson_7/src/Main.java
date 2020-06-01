public class Main {

    public static void main(String[] args) {
        runCatsAndPlate();
    }

    static void runCatsAndPlate() {
        Cat[] cat = new Cat[5];
        cat[0] = new Cat("Барсик", 5);
        cat[1] = new Cat("Василий", 4);
        cat[2] = new Cat("Пушок", 8);
        cat[3] = new Cat("Рыжик", 6);
        cat[4] = new Cat("Том", 15);

        Plate plate = new Plate(30);
        plate.infoPlate();

        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
            cat[i].infoCat();
        }
        plate.infoPlate();
    }
}
