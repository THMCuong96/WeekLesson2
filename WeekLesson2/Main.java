package WeekLesson2;

public class Main {
    private static Company company;
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter Company Name:");
        System.out.println("Enter Company Tax Code");
        System.out.println("Enter Company Revenue");

        System.out.println("Enter Employee Position:");
        boolean valid = false; while (!valid) {
            System.out.println('1. Manager');
            System.out.println('2. HeadOfManagementDepartment');
            System.out.println('3. NormalEmployee');
            System.out.print("Selection: ");
            int choice1 = scanner.nextInt();
            switch (choice1) {
                case 1:
                    "Manager"
                    valid = true;
                    break;
                case 2:
                    "HeadOfManagementDepartment"
                    valid = true;
                    break;
                case 3:
                    "NormalEmployee"
                    valid = true;
                    break;
                default:
                    System.out.println("Please enter a valid number");


            }
            System.out.print("Selection: ");
            String choice2 = scanner.nextLine();
            if (choice2.equals("Manager")) {
                Manager manager = new Manager();
                System.out.println(manager.toString());
            }
            else if (choice2.equals("HeadOfManagementDepartment")) {
                HeadOfManagementDepartment head = new HeadOfManagementDepartment();
                System.out.println(head.toString());}

            else if (choice2.equals("NormalEmployee")) {
                NormalEmployee normal = new NormalEmployee();
                System.out.println(normal.toString());
            }
            else
            {
                System.out.println("Please enter a valid position!"); }
        }

    }
}            }