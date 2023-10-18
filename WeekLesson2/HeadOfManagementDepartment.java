package WeekLesson2;

import java.util.Scanner;

public class HeadOfManagementDepartment extends Employee{ private Employee managerEmployee;

    HeadOfManagementDepartment(String userName, String employeeCode, String phoneNumber, String numberOfWorkingDays, int salaryFor1Day, int calculateSalary) {

        super(userName, employeeCode, phoneNumber, numberOfWorkingDays, salaryFor1Day, calculateSalary);

        this.managerEmployee= managerEmployee;

    }
    @Override
    public void enter() {
        System.out.print("Enter user name: ");
        setUserName(scanner.nextLine());
        System.out.print("Enter Phone Number: ");
        setPhoneNumber(scanner.nextLine());
        System.out.print("Enter Employee Code: ");
        setEmployeeCode(scanner.nextLine());
        System.out.print("Enter Number Of Working Days: ");
        setNumberOfWorkingDays(scanner.nextInt());
        System.out.print("Enter Salary For 1 Day: ");
        setSalaryFor1Day(scanner.nextInt());
        System.out.print("Enter the details of the manager employee: ");
        managerEmployee.enter();
    }




    @Override
    public int calculateSalary() {

    return this.calculateSalary()= getSalaryFor1Day() * 200000 * getNumberOfWorkingDays() + 100000 * managerEmployee.();
}}

