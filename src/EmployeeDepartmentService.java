public class EmployeeDepartmentService {
    public static void printNames(Employee[] employees, int departmentId) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == departmentId) {
                System.out.println(employee.toString());
            }
        }
    }

    public static Employee findSmallestSalary(Employee[] employees, int departmentId) {
        Employee employeeWithSmallestSalary = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() == departmentId) {
                employeeWithSmallestSalary = employee;
                break;
            }
        }
        if (employeeWithSmallestSalary == null) {
            return null;
        }
        for (Employee employee : employees) {
            if (employee.getDepartment() == departmentId && employee.getSalary() < employeeWithSmallestSalary.getSalary()) {
                employeeWithSmallestSalary = employee;
            }
        }
        return employeeWithSmallestSalary;
    }

    public static Employee findLargestSalary(Employee[] employees, int departmentId) {
        Employee employeeWithLargestSalary = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() == departmentId) {
                employeeWithLargestSalary = employee;
                break;
            }
        }
        if (employeeWithLargestSalary == null) {
            return null;
        }
        for (Employee employee : employees) {
            if (employee.getDepartment() == departmentId && employee.getSalary() > employeeWithLargestSalary.getSalary()) {
                employeeWithLargestSalary = employee;
            }
        }
        return employeeWithLargestSalary;
    }

    public static float countEntireSalary(Employee[] employees, int departmentId) {
        float result = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == departmentId) {
                result += employee.getSalary();
            }
        }
        return result;
    }

    public static float getAverageSalary(Employee[] employees, int departmentId) {
        int countEmployees = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == departmentId) {
                countEmployees++;
            }
        }
        return countEntireSalary(employees, departmentId) / countEmployees;
    }

    public static void changeSalary(Employee[] employees, int departmentId, float percentage) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == departmentId) {
                employee.setSalary(employee.getSalary() + (employee.getSalary() / 100 * percentage));
            }
        }
    }
}
