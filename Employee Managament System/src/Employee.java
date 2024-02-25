public class Employee {
    String name;
    int employeeID;
    double salary;

    public Employee(String name, int employeeID, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Dinesh", 101, 10000);
        Employee emp2 = new Employee("Dipak", 102, 20000);
        Employee emp3 = new Employee("Avay", 103, 30000);
        Employee emp4 = new Employee("Dipesh", 104, 25000);
        Employee emp5 = new Employee("Subash", 105, 40000);
        
    }
}
