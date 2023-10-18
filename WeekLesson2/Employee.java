
package WeekLesson2;
import java.util.Scanner;
public class Employee  {
    private String UserName;
    private String EmployeeCode;
    private String PhoneNumber;
    private String NumberOfWorkingDays;
    private int SalaryFor1Day;
    private int CalculateSalary;
    Scanner scanner = new Scanner(System.in);


    public Employee(String UserName, String EmployeeCode, String PhoneNumber, String NumberOfWorkingDays, int SalaryFor1Day, int CalculateSalary) {
        super();
        this.UserName = UserName;
        this.EmployeeCode = EmployeeCode;
        this.PhoneNumber = PhoneNumber;
        this.NumberOfWorkingDays = NumberOfWorkingDays;
        this.SalaryFor1Day = SalaryFor1Day;
        this.CalculateSalary = CalculateSalary;}

    public String getUserName() {

        return UserName;
    }

    public void setUserName(String userName) {
        this.UserName = userName;

    }

    public String getEmployeeCode() {
        return EmployeeCode;

    }

    public void setEmployeeCode(String employeeCode) {
        this.EmployeeCode = employeeCode;


    }

    public String getPhoneNumber() {
        return PhoneNumber;


    }

    public void setPhoneNumber(String phoneNumber) {
        this.PhoneNumber = phoneNumber;
    }

    public String getNumberOfWorkingDays() {
        return NumberOfWorkingDays;

    }

    public void setNumberOfWorkingDays(String numberOfWorkingDays) {
        this.NumberOfWorkingDays = numberOfWorkingDays;

    }

    public int getSalaryFor1Day() {
        return SalaryFor1Day;

    }

    public void setSalaryFor1Day(int salaryFor1Day) {
        this.SalaryFor1Day = salaryFor1Day;

    }

    public int getCalculateSalary() {
        return CalculateSalary;

    }

    public void setCalculateSalary(int calculateSalary) {
        this.CalculateSalary = calculateSalary;

    }
    public void EnterData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter user name");
        String userName = scanner.nextLine();
        System.out.println("Enter Phone Number");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter Employee Code");
        String employeeCode = scanner.nextLine();
        System.out.println("Enter Number Of Working Days");
        String numberOfWorkingDays = scanner.nextLine();
        System.out.println("Enter Salary For 1 Day");
        int salaryFor1Day = scanner.nextInt();
        System.out.println("Enter Calculate Salary");
        int calculateSalary = scanner.nextInt(); }

    public int Payroll(){

        return 0;
    }
    @Override
    public String toString() {
        return "User Name : " + this.UserName + ", Phone Number: " + this.PhoneNumber +
                ", Employee Code: " + this.EmployeeCode + ", Number Of Working Days : " + this.NumberOfWorkingDays +
                ", Salary For 1 Day : " + this.SalaryFor1Day + ", Calculate Salary: " + this.CalculateSalary;


    }}