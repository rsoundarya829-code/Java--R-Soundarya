import java.util.Scanner;
public class Employee {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int TotalSalary = sc.nextInt();
        System.out.println("Employee name : "+name);
        System.out.println("TotalSalary : "+TotalSalary);
    }
    
}
