class Person1 {

    String name;

    Person(String name) {
        this.name = name;
    }
}

class Employee extends Person {

    double salary;

    Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }
}

class Manager extends Employee {

    String department;

    Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}

public class Main {

    public static void main(String[] args) {

        Manager m = new Manager("Manoj",50000,"IT");

        m.display();
    }
}