import java.util.*;

// Employee class
class Employee {
    private int id;
    private String name;
    private String email;

    public Employee(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

// Employee data source interface
interface EmployeeDataSource {
    void addEmployee(Employee employee);
    void updateEmployee(Employee employee);
    Employee getEmployee(int id);
}

// Database employee data source implementation
class DatabaseEmployeeDataSource implements EmployeeDataSource {
    // Simulating a database where employees are stored
    private Map<Integer, Employee> database = new HashMap<>();

    @Override
    public void addEmployee(Employee employee) {
        // Implementation to add employee to the database
        System.out.println("Adding employee to the database: " + employee);
        database.put(employee.getId(), employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        // Implementation to update employee details in the database
        System.out.println("Updating employee in the database: " + employee);
        database.put(employee.getId(), employee);
    }

    @Override
    public Employee getEmployee(int id) {
        // Implementation to retrieve employee from the database
        System.out.println("Retrieving employee from the database with ID: " + id);
        return database.getOrDefault(id, null);
    }
}

public class EMS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating database employee data source
        EmployeeDataSource databaseDataSource = new DatabaseEmployeeDataSource();

        // Taking input for the number of employees
        System.out.println("Enter the number of employees:");
        int numEmployees = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        // Loop to input details for each employee
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.println("Enter employee ID:");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            System.out.println("Enter employee name:");
            String name = scanner.nextLine();
            System.out.println("Enter employee email:");
            String email = scanner.nextLine();
            Employee newEmployee = new Employee(id, name, email);
            databaseDataSource.addEmployee(newEmployee);
        }

        // Taking input for retrieving an employee from the database
        System.out.println("Enter employee ID to retrieve:");
        int searchId = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        Employee retrievedEmployee = databaseDataSource.getEmployee(searchId);
        if (retrievedEmployee != null) {
            System.out.println("Retrieved employee from database: " + retrievedEmployee);
        } else {
            System.out.println("Employee does not exist in the database.");
        }

        // Closing scanner
        scanner.close();
    }
}


