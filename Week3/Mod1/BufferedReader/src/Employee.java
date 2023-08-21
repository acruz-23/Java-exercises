public class Employee {
    private int employeeId;
    private float hoursWorked, payRate;
    private String name;

    public Employee(int employeeId, float hoursWorked, float payRate, String name) {
        this.employeeId = employeeId;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
        this.name = name;
    }

    public float getGrossPay(){
        float   basePay, overtimePay = 0;
        if (this.hoursWorked > 40){
            basePay = 40 * this.payRate;
            overtimePay = (float) (1.5 * this.payRate * (this.hoursWorked - 40.0));
        }else
            basePay = this.hoursWorked * this.payRate;
        return  basePay + overtimePay;
    }
    public void displayEmployee(){
        System.out.println("Employee ID: "+ this.employeeId);
        System.out.println("Name: "+ this.name);
        System.out.println("Gross pay: "+ getGrossPay() + "\n");
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setPayRate(float payRate) {
        this.payRate = payRate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public float getPayRate() {
        return payRate;
    }

    public String getName() {
        return name;
    }
}
