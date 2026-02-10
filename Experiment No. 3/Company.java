import java.util.Scanner;

class Employee {
    String name, address, jobTitle;
    double salary;

    Employee(String n, String a, double s, String j) {
        name = n;
        address = a;
        salary = s;
        jobTitle = j;
    }

    double bonus() {
        return salary * 0.10;
    }

    void report() {
        System.out.println(jobTitle + " Performance: Good");
    }

    void project() {
        System.out.println(jobTitle + " handles tasks.");
    }
}

class Manager extends Employee {
    Manager(String n, String a, double s) {
        super(n, a, s, "Manager");
    }

    double bonus() {
        return salary * 0.20;
    }

    void project() {
        System.out.println("Manager manages the project.");
    }
}

class Developer extends Employee {
    Developer(String n, String a, double s) {
        super(n, a, s, "Developer");
    }

    double bonus() {
        return salary * 0.15;
    }

    void project() {
        System.out.println("Developer builds the application.");
    }
}

class Programmer extends Employee {
    Programmer(String n, String a, double s) {
        super(n, a, s, "Programmer");
    }

    double bonus() {
        return salary * 0.12;
    }

    void project() {
        System.out.println("Programmer writes code.");
    }
}

public class Company {
    public static void main(String[] args) {
        Employee[] e = {
            new Manager("Amit", "Pune", 80000),
            new Developer("Riya", "Mumbai", 60000),
            new Programmer("Suyash", "Nagpur", 50000)
        };

        for (Employee emp : e) {
            emp.report();
            System.out.println("Bonus: " + emp.bonus());
            emp.project();
            System.out.println();
        }
    }
}
