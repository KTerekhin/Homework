public class Employee {
    String name, position, eMail, phoneNumber;
    int salary, age;

    public Employee(String name, String position, String eMail, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    void printInformation() {
        System.out.println(String.format("ФИО: %s. Должность: %s. Email: %s. Номер телефона: %s. Зарплата: %s. Возраст: %s.",
                name, position, eMail, phoneNumber, salary, age));
    }
}



//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//2. Конструктор класса должен заполнять эти поля при создании объекта.
//3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//4. Создать массив из 5 сотрудников.
//5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.