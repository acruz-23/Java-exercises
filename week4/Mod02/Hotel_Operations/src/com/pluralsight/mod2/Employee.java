package com.pluralsight.mod2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Employee {
    private float hoursWorked, payRate;
    private int employeeId;
    private String name, department;
    boolean isPunchedIn = false;
    LocalTime clockIn, clockout;

    public Employee(float payRate, int employeeId, String name, String department) {
        this.payRate = payRate;
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
    }
    public float getRegularHours(){
        if (this.hoursWorked > 40){
            return 40.0f;
        }else
            return this.hoursWorked;
    }

    public float getOvertimeHours(){
        if (this.hoursWorked > 40){
            return  this.hoursWorked - 40.0f;
        }else
            return 0.0f;
    }

    public float getTotalPay(){
        float basePay = getRegularHours() * payRate;
        float overtimePay = getOvertimeHours() * payRate * 1.5f;
        return basePay + overtimePay;
    }

    public void punchTimeCard() {
        if (this.isPunchedIn == false) {
            this.isPunchedIn = true;
            this.clockIn = LocalTime.now();
            LocalDate date = LocalDate.now();
            if (date.getDayOfWeek().equals("Thursday")){
                this.hoursWorked = 0;
        }else {
            this.isPunchedIn = false;
            this.clockout = LocalTime.parse("20:45:15");
            this.hoursWorked += this.clockIn.until(this.clockout, ChronoUnit.HOURS);

            }
        }
        System.out.println(this.hoursWorked);
    }

    public void setPayRate(float payRate) {
        this.payRate = payRate;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public float getPayRate() {
        return payRate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
}
