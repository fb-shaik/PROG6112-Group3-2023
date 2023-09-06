package employee_inhertinace_g3;

//Super Class - Base/Parent Class
public class Employee {
    //2 generic fields
    String name;
    double salary;
    //parameterized constructor
        public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
        //2 generic methods
        void introduce(){
            System.out.println("Hello, I'm "+ name + " & I'm an employee at X.  ");
        }
        void work(){
            System.out.println(name + " is performing their job duties. ");
        }
}

//SubClass: Manager (inherits from Employee)
class Manager extends Employee{
String department; //exclusive to the child class; Parent class does'nt know about it / have access to 

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department=department;
    }
@Override
    void introduce(){
            System.out.println("Hello, I'm "+ name + " & I'm the manager for the " + department + " department. ");
        }
    //exclusive method to the Manager Class
    void organizeTeamMeeting(){
        System.out.println(name + " has organized a team meeting. ");
    }
}

//SubClass: Developer (inherits from Employee)
class Developer extends Employee{
    String programmingLanguage;//exclusive to the child class; Parent class does'nt know about it / have access to 

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    void introduce(){
            System.out.println("Hello, I'm "+ name + " & I'm  a developer that specializes in " + programmingLanguage + " . ");
        }
    //exclusive method to the Developer Class
    void writeCode(){
        System.out.println(name + " is writing code using " + programmingLanguage + " . ");
    }
    

}
