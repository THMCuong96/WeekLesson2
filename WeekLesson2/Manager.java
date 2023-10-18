package WeekLesson2;

public class Manager extends Employee { private int sharesInTheCompany;

    public Manager() {
        super();
    }

    public Manager(int sharesInTheCompany) {
        super();
        this.sharesInTheCompany = sharesInTheCompany;
    }

    public int getSharesInTheCompany() {
        return sharesInTheCompany;
    }

    public void setSharesInTheCompany(int sharesInTheCompany) {
        this.sharesInTheCompany = sharesInTheCompany;
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
        System.out.print("Enter Shares  In The Company: " + "%");
        sharesInTheCompany = scanner.nextInt();
    }

    @Override
    public int calculateSalary() {
        return this.calculateSalary() = getSalaryFor1Day() * getNumberOfWorkingDays() * 300000;
    }

    @Override
    public String toString() {
        return super.toString() + "\n, Shares In The Company: " + this.sharesInTheCompany +
                ", Calculate Salary: " + this.calculateSalary();
    }

}