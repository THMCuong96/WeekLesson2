package WeekLesson2;

public class NormalEmployee extends Employee{ private int directManager;
    public NormalEmployee() {
        super();
    }


    public NormalEmployee(int directManager) {
        super();
        this.directManager = directManager;
    }

    public int getDirectManager() {
        return directManager;
        public int getDirectManager() { return directManager;

    }

    public void setDirectManager(int directManager) {
        this.directManager = directManager;
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
        System.out.print("Enter Direct Manager: ");
        directManager = scanner.nextInt();
    }
@Override
        public void enter() {
            System.out.print("Enter Direct Manager: ");
            directManager = scanner.nextInt();
            if (directManager == -1) {
        }
            @Override
    public int calculateSalary() {
        return getSalaryFor1Day() * getNumberOfWorkingDays() * 100000;
    }

    @Override
    public String toString() {
        return super.toString() + "\n, Direct Manager: " + this.directManager +
                ", Calculate Salary: " + this.calculateSalary();
    }

}