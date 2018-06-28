package ManagementTest;

import Employees.Employee;

public class Manager extends Employee {
    private String deptname;

    public Manager(String name, int ni, double salary, String deptname){
        super(name, ni, salary);
        this.deptname = deptname;
    }

    public String getDeptname() {
        return this.deptname;
    }
}
