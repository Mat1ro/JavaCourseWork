public class Employee {
    public String fullName;
    private float salary;
    private int department;
    int id;
    static int counterId = 1;


    public Employee(String fullName, int salary, int department) {
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;
        this.id = counterId++;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Employee otherEmployee = (Employee) other;
        return fullName.equals(otherEmployee.fullName) && salary == otherEmployee.salary && department == otherEmployee.department;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(fullName, salary, department);
    }

    @Override
    public String toString() {
        return "Employee [fullName=" + fullName + ", salary=" + salary + ", department=" + department + "]";
    }
}
