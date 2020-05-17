import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Random random = new Random();

    public static void main(String[] args) {

        //1
        guessTheNumber();

        //2
        guessTheWord();
	    }

	//1
    public static void guessTheNumber() {
        Scanner scanner = new Scanner(System.in);
        do {
            int guessedNumber = random.nextInt(10);
            System.out.println("Угадайте число от 0 до 9 с 3 попыток.");
            for (int i = 3; i > 0; i--) {
                int enteredNumber = scanner.nextInt();
                if (enteredNumber == guessedNumber) {
                    System.out.println("Вы угадали");
                    break;
                } else if (enteredNumber < guessedNumber) {
                    System.out.println("Загаданное число больше.");
                } else {
                    System.out.println("Загаданное число меньше.");
                }
                if (i - 1 > 0) {
                    System.out.println("Осталось " + (i-1) + " попыток");
                } else System.out.println("Вы проиграли");
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        } while (scanner.nextInt() == 1);
    }

    //2
    public static void guessTheWord() {
        Scanner scanner = new Scanner(System.in);
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int wordsCell = random.nextInt(words.length - 1); // ячейка массива
        String guessedWord = words[wordsCell]; // загаданное слово
        System.out.println("Угадайте слово.");
        do {
            String enteredWord = scanner.nextLine();
            if (enteredWord.equals(guessedWord)) {
                System.out.println("Вы угадали!");
                break;
            }
            for (int i = 0; i < 15; i++) {
                if (i < guessedWord.length() && i < enteredWord.length() && guessedWord.charAt(i) == enteredWord.charAt(i)) {
                    System.out.print(guessedWord.charAt(i));
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
            System.out.println("Введите другое слово.");
        } while (true);
    }
}