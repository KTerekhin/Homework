public class Plate {
    private int food;
    private int extraFood = 1;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int appetite) {
        if (food - appetite < 0) {
            return false;
        } else {
            food -= appetite;
            return true;
        }
    }

    public void infoPlate() {
        System.out.println("Количество еды в тарелке: " + food);
    }

    public void addFood(int extraFood) {
        this.food += extraFood;
        System.out.println(String.format("В тарелке %s еды", food));
    }
}
