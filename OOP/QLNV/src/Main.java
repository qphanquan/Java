import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ManageEmployee manageEmployee = new ManageEmployee();
		while (true) {
            System.out.println("Application Manager Employee");
            System.out.println("Enter 1: To insert employee");
            System.out.println("Enter 2: To remove employee by id: ");
            System.out.println("Enter 3: To show information employee");
            System.out.println("Enter 4: To exit:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                	System.out.print("Enter id: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter name:");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter Department: ");
                    scanner.nextLine();
                    String department = scanner.nextLine();
                    System.out.print("Enter Code: ");
                    long code = scanner.nextLong();
                    System.out.print("Enter SalaryRate: ");
                    double salaryRate = scanner.nextDouble();
                    Employee employee = new Employee(id, name, age, department, code, salaryRate);
                    manageEmployee.AddEmployee(employee);
                    System.out.println(employee.toString());
                    break;
                }
                case "2": {
                    System.out.print("Enter remove employee by id: ");
                    int id = scanner.nextInt();
                    if(manageEmployee.DeleteById(id)) System.out.println("success");
                    else System.out.println("error");
                    break;
                }
                case "3": {
                	manageEmployee.ShowInfor();
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }

        }
	}
}
