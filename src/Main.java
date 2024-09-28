public class Main {

    public static void endl() {
        System.out.println();
    }

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.printNames();
        endl();

        System.out.println("employeeBook.countEntireSalary() = " + employeeBook.countEntireSalary());
        endl();

        System.out.println(employeeBook.findSmallestSalary().toString());
        endl();

        System.out.println(employeeBook.findLargestSalary().toString());
        endl();

        System.out.println("employeeBook.getAverageSalary() = " + employeeBook.getAverageSalary());
        endl();

        employeeBook.changeSalary(2);
        System.out.println("employeeBook.getAverageSalary() = " + employeeBook.getAverageSalary());
        endl();

        // less
        employeeBook.printEmployeesWithLessSalary(43000);
        endl();

        // more
        employeeBook.printEmployeesWithMoreSalary(43000);
        endl();

        employeeBook.deleteEmployee(3);
        employeeBook.addEmployee(new Employee("John Snow", 40000, 1));
        employeeBook.printNames();
        endl();

        System.out.println("employeeBook.getEmployee(11) = " + employeeBook.getEmployee(11).toString());
        endl();

        Employee tester = new Employee("Tester", 50000, 10);
        System.out.println("tester.getSalary() = " + tester.getSalary());
        tester.setSalary(1000);
        System.out.println("tester.getSalary() = " + tester.getSalary());
        System.out.println("tester.getDepartment() = " + tester.getDepartment());
        tester.setDepartment(5);
        System.out.println("tester.getDepartment() = " + tester.getDepartment());
        endl();

        Employee tester2 = new Employee("Tester2", 50000, 10);
        if (tester.equals(tester2)) {
            System.out.println("tester.equals(tester2) = true");
        } else {
            System.out.println("tester.equals(tester2) = false");
        }
        Employee tester3 = new Employee("Tester", 1000, 5);
        if (tester.equals(tester3)) {
            System.out.println("tester.equals(tester3) = true");
        } else {
            System.out.println("tester.equals(tester3) = false");
        }
        endl();

        System.out.println("EmployeeDepartmentService.findSmallestSalary(employeeBook.getEmployees(), 2) = " + EmployeeDepartmentService.findSmallestSalary(employeeBook.getEmployees(), 2));
        System.out.println("EmployeeDepartmentService.findLargestSalary(employeeBook.getEmployees(), 4) = " + EmployeeDepartmentService.findLargestSalary(employeeBook.getEmployees(), 4));
        endl();

        System.out.println("EmployeeDepartmentService.countEntireSalary(employeeBook.getEmployees(), 4) = " + EmployeeDepartmentService.countEntireSalary(employeeBook.getEmployees(), 4));
        endl();

        System.out.println("EmployeeDepartmentService.getAverageSalary(employeeBook.getEmployees(), 2) = " + EmployeeDepartmentService.getAverageSalary(employeeBook.getEmployees(), 2));
        endl();

        EmployeeDepartmentService.changeSalary(employeeBook.getEmployees(), 2, 10);
        EmployeeDepartmentService.printNames(employeeBook.getEmployees(), 2);
    }


}