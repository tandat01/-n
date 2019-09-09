package Exam;

import java.util.Scanner;

public class EmployeeFullTime extends SalaryPolicy{
    public float rate=4f;
    public float baseSalary;

    public EmployeeFullTime() {
    }

    public EmployeeFullTime(float rate, float baseSalary) {
        this.rate = rate;
        this.baseSalary = baseSalary;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void getSalary(){
        float salary;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter salary:");
        baseSalary=scanner.nextFloat();
        salary=rate*baseSalary;
        System.out.println("Salary is: "+salary);
    }

}
