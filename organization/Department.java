package organization;

import java.util.*;

public class Department {
    private String departmentName;
    private ArrayList<Employee> workers = new ArrayList<>();
    public Department(String departmentName) {
        this.departmentName = departmentName;
    }
    public Department(ArrayList<Employee> workers) {
        this.workers = workers;
    }


    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getWorkersNumber() {
        return workers.size();
    }
    public int getWorkersSalarySum() {
        int salarySum = 0;
        for(Employee employee: workers){
            salarySum += employee.getSalary();
        }
        return salarySum;
    }

    public Employee getEmployee(String firstname, String lastname) throws Exception{
        for(Employee employee: workers){
            if (employee.getFirstname().equals(firstname) && employee.getLastname().equals(lastname)) {
                return  employee;
            }
        }
        throw new NoSuchElementException("Employee not found");
    }
    public void fairEmployee(String firstname, String lastname, String position) throws Exception{
        for(Employee employee: workers){
            if (employee.getFirstname().equals(firstname) && employee.getLastname().equals(lastname) && employee.getPosition().equals(position)){
                this.workers.remove(employee);
                return;
            }
        }
        throw new NoSuchElementException("Employee not found");
    }
    public void hireEmployee(Employee newEmployee){
        this.workers.add(newEmployee);
    }

    public ArrayList<Employee> getWorkers() {
        return workers;
    }
    public ArrayList<Employee> getSortedWorkers() {
        ArrayList<Employee> sortedWorkers = new ArrayList<>(workers);
        Collections.sort(sortedWorkers);
        return sortedWorkers;
    }
}
