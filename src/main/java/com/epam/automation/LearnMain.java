package com.epam.automation;

public class LearnMain {
    int puppyAge;

    public LearnMain(String name){
        System.out.println("Передаваемое имя: " + name);
        // Так выглядит конструктор в Java и у него один параметр, name.
    }

    public void setAge(int age){
    puppyAge = age;
    }

    public int getAge( ){
        System.out.println("Возраст щенка:" + puppyAge );
        return puppyAge;
    }

    public static void main(String[] args) {
        LearnMain myPuppy = new LearnMain("Багет"); //Создание объекта myPuppy.
        myPuppy.setAge( 2 ); //Вызов метод класса, чтобы установить возраст щенка.
        myPuppy.getAge( ); //Вызов другого метода класса, чтобы получить возраст щенка.
        System.out.println("Значение переменной:" + myPuppy.puppyAge ); //Получение переменной экземпляра класса.
    }
    //Каждый раз, когда в Java создается новый объект, будет вызываться по меньшей мере один конструктор.
    // Главное правило является то, что они должны иметь то же имя, что и класс, который может иметь более одного конструктора
}
class Employee{
    // Переменная экземпляра открыта для любого дочернего класса.
    public String name;

    // Переменная salary видна только в Employee.
    private double salary;

    // Имя переменной присваивается в конструкторе.
    public Employee (String empName){
        name = empName;
    }

    // Переменной salary присваивается значение.
    public void setSalary(double empSal){
        salary = empSal;
    }

    // Этот метод выводит на экран данные сотрудников.
    public void printEmp(){
        System.out.println("имя: " + name );
        System.out.println("зарплата:" + salary);
    }

    public static void main(String args[]){
        Employee empOne = new Employee("Олег");
        empOne.setSalary(1000);
        empOne.printEmp();
    }
}

class InstanceCounter {

    private static int numInstances = 0;

    protected static int getCount() {
        return numInstances;
    }

    private static void addInstance() {
        numInstances++;
    }

    InstanceCounter() {
        InstanceCounter.addInstance();
    }

    public static void main(String[] arguments) {
        System.out.println("Начиная с " +
                InstanceCounter.getCount() + " экземпляра");
        for (int i = 0; i < 500; ++i){
            new InstanceCounter();
        }
        System.out.println("Создано " +
                InstanceCounter.getCount() + " экземпляров");
    }
}
