
package employee_inhertinace_g3;

public class Employee_Inhertinace_G3 {

    public static void main(String[] args) {
       //create an instance for each class (Parent & Child)
       //Parent Class - Employee
       Employee employee = new Employee("Joe", 10000);
       //method class for employee
       
       //Child Class - Manager
       Manager manager = new Manager("Alice", 15000, "Sales");
       //method class for manager
       manager.introduce();
       manager.work();
       manager.organizeTeamMeeting();
        System.out.println();
       //Child Class - Developer
       Developer developer = new Developer("Jack", 20000, "Java");
    //method class for developer
    developer.introduce();
    developer.work();
    developer.writeCode();
    }
    
}
