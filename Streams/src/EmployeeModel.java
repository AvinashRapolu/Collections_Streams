public class EmployeeModel
{
    private String employeeNo;
    private String employeeName;
    private float salary;

    public EmployeeModel(String employeeNo,String employeeName,float salary)
    {
        this.employeeNo=employeeNo;
        this.employeeName=employeeName;
        this.salary=salary;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
