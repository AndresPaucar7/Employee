import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


public class employeeDemo {

public static void main(String[] args) {
    String currentDirectory = System.getProperty("user.dir");
    System.out.println("Working Directory " + currentDirectory);
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yyyy @ hh:mm");
    System.out.println("Programmer: " + System.getProperty("user.name"));
    System.out.println("Lab 19.1: " + dtf.format(now));
    System.out.println();
    
    Employee firstEmployee = new Employee();
    firstEmployee.setName("Susan Meyers");
    firstEmployee.setIdNumber(47899);
    firstEmployee.setDepartment("Accounting");
    firstEmployee.setPosition("Vice President");
    

    Employee secondEmployee = new Employee();
    secondEmployee.setName("Mark Jones");
    secondEmployee.setIdNumber(39119);
    secondEmployee.setDepartment("IT");
    secondEmployee.setPosition("Programmer");
    

    Employee thridEmployee = new Employee();
    thridEmployee.setName("Joy Rogers");
    thridEmployee.setIdNumber(81774);
    thridEmployee.setDepartment("Manufacturing");
    thridEmployee.setPosition("Engineer");

    System.out.println("Employee #1: ");
    System.out.println("Name: " + firstEmployee.getName());
    System.out.println("ID Number : " + firstEmployee.getIdNumber());
    System.out.println("Department: " + firstEmployee.getDepartment());
    System.out.println("Position: " + firstEmployee.getposition());
    System.out.println();
    
    System.out.println("Employee #2: ");
    System.out.println("Name: " + secondEmployee.getName());
    System.out.println("ID Number : " + secondEmployee.getIdNumber());
    System.out.println("Department: " + secondEmployee.getDepartment());
    System.out.println("Position: " + secondEmployee.getposition());
    System.out.println();

    
    System.out.println("Employee #3: ");
    System.out.println("Name: " + thridEmployee.getName());
    System.out.println("ID Number : " + thridEmployee.getIdNumber());
    System.out.println("Department: " + thridEmployee.getDepartment());
    System.out.println("Position: " + thridEmployee.getposition());
    System.out.println();

    }
}
