public class Main {

    public static void main(String[] args) {
        runProgram();
    }

    static void runProgram() {
        createCats();
        createDogs();
    }

    static void createCats() {
        int catCount = 0;
        Cat barsik = new Cat("Барсик");
        barsik.run(150);
        barsik.swim(2);

        catCount++;

        Cat vaska = new Cat("Васька");
        vaska.run(250);
        vaska.swim(1);

        catCount++;

        System.out.println(String.format("Количество котов %s", catCount));
    }

    static void createDogs() {
        int dogsCount = 0;
        Dog tuzik = new Dog("Тузик");
        tuzik.run(150);
        tuzik.swim(5);

        dogsCount++;

        Dog sharik = new Dog("Шарик");
        sharik.run(450);
        sharik.swim(11);

        dogsCount++;

        System.out.println(String.format("Количество собак %s", dogsCount));
    }
}


//1. Создать классы Собака и Кот с наследованием от класса Животное.
//2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
//Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание:кот не умеет плавать, собака 10 м.).
//4. * Добавить подсчет созданных котов, собак и животных.
