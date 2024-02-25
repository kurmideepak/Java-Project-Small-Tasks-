// EmpManagementSystem.java
import java.util.ArrayList;
import java.util.Scanner;

public class EmpManagementSystem {
    private ArrayList<Employee> empList = new ArrayList<>();

    public void addEmployee(String name, int employeeId, double salary) {
        Employee newEmployee = new Employee(name, employeeId, salary);
        empList.add(newEmployee);
        System.out.println("Employee added successfully!");
    }

    public void dispEmpInformation(int employeeId) {
        for (Employee employee : empList) {
            if (employee.getEmployeeId() == employeeId) {
                System.out.println("Employee Information:");
                System.out.println("Name: " + employee.getName());
                System.out.println("Employee ID: " + employee.getEmployeeId());
                System.out.println("Salary: Rs. " + employee.getSalary());
                return; // Return to exit the loop once the employee is found
            }
        }
        System.out.println("Employee not found");
    }

    public void dispAllEmployees() {
        if (empList.isEmpty()) {
            System.out.println("There are no employees in the system.");
        } else {
            System.out.println("List of Employees:");
            for (Employee employee : empList) {
                System.out.println("Name: " + employee.getName() + ", Employee ID: " + employee.getEmployeeId() + ", Salary: Rs. " + employee.getSalary());
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmpManagementSystem empManagementSystem = new EmpManagementSystem();

        while (true) {
            System.out.println("\nEmployee Management System Menu");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employee Information");
            System.out.println("3. Display All Employees");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter employee ID: ");
                    int employeeId = sc.nextInt();

                    System.out.print("Enter Employee salary: Rs. ");
                    double salary = sc.nextDouble();

                    empManagementSystem.addEmployee(name, employeeId, salary);
                    break;
                case 2:
                    System.out.print("Enter Employee ID to Display Employee Information: ");
                    int empID = sc.nextInt();
                    empManagementSystem.dispEmpInformation(empID);
                    break;
                case 3:
                    empManagementSystem.dispAllEmployees();
                    break;
                case 4:
                    System.out.println("Exiting Employee Management System. Thank You!");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice. Please choose a correct option (1-4).");
            }
        }
    }
}






/*
* Documentation:
* Purpose: The Employee Management System is design to manage the records of employee. It includes functionalities such as adding new employees, displaying individual employee information, displaying a list of all employees and error handling for cases like invalid input or non-existing employees.
*
* Class Structure:
* 1. Employee Class:
* Attributes: 'name' (String), 'employeeId' (int), 'salary' (double).
* Constructor: Initializes employee attributes
* Getter and Setter methods: It allows the Access and modification of empliyee attributes.
*
* 2. EmpManagementSystem Class:
* Attributes: 'empList' (ArrayList<Employee>) to store employee objects.
* Methods:
* 'addEmployee': Adds a new employee to the system
* 'dispEmpInformation': Displays individual employee information based on employee ID.
* 'dispAllEmployees': Displays a list of all employees in the system.
* 'main': Provides a menu-driven user interface for intracting with the Employee Management System.
*
* Usage Examples:
* 1. Adding Employee:
* User select option 1 from the menu, enters employee details( name, ID, salary).
* The system add the employee and confirms the successful addition.
*
* 2. Displaying individual Employee and ingormation:
* User selects option 2, enters the employee ID.
* The system displays the informaiton for the specified employee.
*
* 3. Displaying All Employees:
* User selects option 3 : The system display a list of all employees in the system.
*
* 4. Error Handling:
* The system handles cases like invalid input for employee details.
* Displays appropriate messages for non-existent employees.
*
* Testing:  The program is tested by adding employees and verified that their information is displayed correctly.
*  */