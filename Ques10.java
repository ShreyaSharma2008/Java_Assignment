class Employee {
    private int empNo;
    private String empName;
    private int empBasic;

    Employee() {
    }

    Employee(int empNo, String empName, int empBasic) {
        this.empNo = empNo;
        this.empName = empName;
        this.empBasic = empBasic;
    }

    int getEmpNo() {
        return empNo;
    }

    String getEmpName() {
        return empName;
    }

    int getEmpBasic() {
        return empBasic;
    }

    double calculateSalary() {
        return empBasic;
    }
}

class Manager extends Employee {

    Manager(int empNo, String empName, int empBasic) {
        super(empNo, empName, empBasic);
    }

    double calculateSalary() {

        double HRA = getEmpBasic() * 0.20;
        double DA = getEmpBasic() * 0.10;

        return getEmpBasic() + HRA + DA;
    }
}

class Programmer extends Employee {

    Programmer(int empNo, String empName, int empBasic) {
        super(empNo, empName, empBasic);
    }

    double calculateSalary() {

        double HRA = getEmpBasic() * 0.15;
        double DA = getEmpBasic() * 0.05;

        return getEmpBasic() + HRA + DA;
    }
}

public class Ques10 {
    public static void main(String[] args) {

        Employee e;

        e = new Manager(101, "Rahul", 50000);
        System.out.println("Manager Salary = " + e.calculateSalary());

        e = new Programmer(102, "Aman", 40000);
        System.out.println("Programmer Salary = " + e.calculateSalary());
    }
}
