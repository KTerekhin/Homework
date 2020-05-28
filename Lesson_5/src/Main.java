public class Main {

    public static void main(String[] args) {
        runProgram();
    }

    static void runProgram() {
        informationPeople();
        arrayEmployee();
    }
    public static void informationPeople() {
        Employee employeeNumberOne = new Employee("Petrov Petr Petrovich", "Java-Developer", "ppetrov@gmail.com", "223366554", 150000, 30);
        Employee employeeNumberTwo = new Employee("Dmitriev Dmitriy Dmitriyevich", "Python-Developer", "ddd@gmail.com", "254687236", 100000, 56);
        Employee employeeNumberThree = new Employee("Terekhin Konstantin Aleksandrovich", "Java-Developer", "kterekhin@gmail.com", "985463214", 250000, 30);
        Employee employeeNumberFour = new Employee("Smirnova Anna Viktorovna", "Singer", "anna_smirnova@gmail.com", "879635412", 50000, 50);
        Employee employeeNumberFive = new Employee("Ivanov Ivan Ivanovich", "Web-Designer", "ivanovii@gmail.com", "123456789", 180000, 35);

        employeeNumberOne.printInformation();
        employeeNumberTwo.printInformation();
        employeeNumberThree.printInformation();
        employeeNumberFour.printInformation();
        employeeNumberFive.printInformation();
    }

    public static void arrayEmployee() {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Petrov Petr Petrovich", "Java-Developer", "ppetrov@gmail.com", "223366554", 150000, 30);
        employees[1] = new Employee("Dmitriev Dmitriy Dmitriyevich", "Python-Developer", "ddd@gmail.com", "254687236", 100000, 56);
        employees[2] = new Employee("Terekhin Konstantin Aleksandrovich", "Java-Developer", "kterekhin@gmail.com", "985463214", 250000, 30);
        employees[3] = new Employee("Smirnova Anna Viktorovna", "Singer", "anna_smirnova@gmail.com", "879635412", 50000, 50);
        employees[4] = new Employee("Ivanov Ivan Ivanovich", "Web-Designer", "ivanovii@gmail.com", "123456789", 180000, 35);

        for (int i = 0; i < 5; i++) {
            if (employees[i].age > 40) employees[i].printInformation();
        }
    }
}


//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//2. Конструктор класса должен заполнять эти поля при создании объекта.
//3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//4. Создать массив из 5 сотрудников.
//5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.