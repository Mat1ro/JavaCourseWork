public class EmployeeBook {
    private Employee[] employees = new Employee[10];

    public EmployeeBook() {
        employees[0] = new Employee("Alice Smith", 45000, 2);
        employees[1] = new Employee("Bob Johnson", 38000, 3);
        employees[2] = new Employee("Charlie Brown", 50000, 4);
        employees[3] = new Employee("Diana King", 41000, 5);
        employees[4] = new Employee("Eve Davis", 47000, 3);
        employees[5] = new Employee("Frank Miller", 39000, 3);
        employees[6] = new Employee("Grace Wilson", 52000, 1);
        employees[7] = new Employee("Henry Taylor", 43000, 4);
        employees[8] = new Employee("Ivy Lewis", 46000, 5);
        employees[9] = new Employee("Jack Walker", 44000, 2);
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void printNames() {
        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }
    }

    public float countEntireSalary() {
        float result = 0;
        for (Employee emp : employees) {
            result += emp.getSalary();
        }
        return result;
    }

    public Employee findSmallestSalary() {
        Employee employeeWithSmallestSalary = employees[0];
        for (Employee emp : employees) {
            if (emp.getSalary() < employeeWithSmallestSalary.getSalary()) {
                employeeWithSmallestSalary = emp;
            }
        }
        return employeeWithSmallestSalary;
    }

    public Employee findLargestSalary() {
        Employee employeeWithLargestSalary = employees[0];
        for (Employee emp : employees) {
            if (emp.getSalary() > employeeWithLargestSalary.getSalary()) {
                employeeWithLargestSalary = emp;
            }
        }
        return employeeWithLargestSalary;
    }

    public float getAverageSalary() {
        return countEntireSalary() / employees.length;
    }

    public void changeSalary(float percentage) {
        for (Employee emp : employees) {
            emp.setSalary(emp.getSalary() + (emp.getSalary() / 100 * percentage));
        }
    }

    public void printEmployeesWithLessSalary(float salary) {
        for (Employee emp : employees) {
            if (emp.getSalary() < salary) {
                System.out.println("id: " + emp.id + ", " + emp.toString());
            }
        }
    }

    public void printEmployeesWithMoreSalary(float salary) {
        for (Employee emp : employees) {
            if (emp.getSalary() > salary) {
                System.out.println("id: " + emp.id + ", " + emp.toString());
            }
        }
    }

    public void deleteEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].id == id) {
                employees[i] = null;
            }
        }
    }

    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    public Employee getEmployee(int id) {
        for (Employee emp : employees) {
            if (emp.id == id) {
                return emp;
            }
        }
        return null;
    }
}