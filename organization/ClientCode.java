package organization;


import java.util.ArrayList;

public class ClientCode {
    public static void main(String[] args) {

        Department itDepartment = new Department("IT Department");


        Employee dilnazZhumabaikyzy = new Employee("Dilnaz", "Zhumabaikyzy");
        Employee johnGalt = new Employee("John", "Galt", "Product Owner", 50000);
        Employee albertEinstein = new Employee("Albert", "Einstein", "Engineer", 40000);


        itDepartment.hireEmployee(dilnazZhumabaikyzy);
        itDepartment.hireEmployee(johnGalt);
        itDepartment.hireEmployee(albertEinstein);


        System.out.println("Department Name: " + itDepartment.getDepartmentName());
        System.out.println("Number of Workers: " + itDepartment.getWorkersNumber());
        System.out.println("Total Salary: $" + itDepartment.getWorkersSalarySum());

        // Print the list of workers
        System.out.println("List of Workers:");
        ArrayList<Employee> workers = itDepartment.getWorkers();
        for (Employee employee : workers) {
            System.out.println("Name: " + employee.getFirstname() + " " + employee.getLastname());
            System.out.println("Position: " + employee.getPosition());
            System.out.println("Salary: " + employee.getSalary());
        }


        System.out.println("Sorted List of Workers:");
        ArrayList<Employee> sortedWorkers = itDepartment.getSortedWorkers();
        for (Employee employee : sortedWorkers) {
            System.out.println("Name: " + employee.getFirstname() + " " + employee.getLastname());
            System.out.println("Position: " + employee.getPosition());
            System.out.println("Salary: " + employee.getSalary());
        }

        try {
            itDepartment.fairEmployee("Albert", "Einstein", "Engineer");
            System.out.println("Albert Einstein fired successfully.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
