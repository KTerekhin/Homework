import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*2*/
        int i = 15;
        byte b = 1;
        short s = 3;
        long l = 4000000L;

        float f = 1.9f;
        double d = 6.3;

        char c = 'c';

        /*3*/
        System.out.println(calculate(5.2f, 6.4f, 7.7f, 3.6f));
        /*4*/
        System.out.println(task10to20());
        /*5*/
        positiveToNegative1();
        /*6*/
        System.out.println(positiveToNegative2());
        /*7*/
        greeting();
        /*8*/
        leapYear();
    }

    //3
    static float calculate(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    //4
    static boolean task10to20() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a + b > 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }

    }

    //5
    static void positiveToNegative1() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    //6
    static boolean positiveToNegative2() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a < 0) {
            return true;
        }
        else
        return false;
    }

    //7
    static void greeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Имя");
        String s = scanner.nextLine();
        System.out.println("Привет, " + s + "!");
    }

    //8
    static void leapYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год");
        int year = scanner.nextInt();

        if (year % 400 == 0) {
            System.out.println("Год високосный");
        } else if (year % 100 == 0) {
            System.out.println("Год невисокосный");
        } else if (year % 4 == 0) {
            System.out.println("Год високосный");
        }
        else {
            System.out.println("Год невисокосный");
        }
    }


//    1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
//    2. Создать переменные всех пройденных типов данных и инициализировать их значения.
//    3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
//    где a, b, c, d – аргументы этого метода, имеющие тип float.
//    4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
//    в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
//    5. Написать метод, которому в качестве параметра передается целое число, метод должен
//    напечатать в консоль, положительное ли число передали или отрицательное. Замечание:
//    ноль считаем положительным числом.
//    6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть
//    true, если число отрицательное.
//    7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
//    Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
//    8. *Написать метод, который определяет, является ли год високосным, и выводит сообщение в
//    консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й –
//    високосный.


}
