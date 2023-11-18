package organization;

public class Employee  implements Comparable<Employee>{
    private String firstname;
    private String lastname;

    private String position;
    private int salary;

    private Department department;

    public Employee(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
        this.position = "Engineer";
        this.salary = 30000;
    }
    public Employee(String firstname, String lastname, String position, int salary){
        this.firstname = firstname;
        this.lastname = lastname;
        this.position = position;
        this.salary = salary;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        int lastNameComparison = this.lastname.compareTo(otherEmployee.lastname);

        if (lastNameComparison == 0) {
            return this.firstname.compareTo(otherEmployee.firstname);
        }

        return lastNameComparison;
    }
}
