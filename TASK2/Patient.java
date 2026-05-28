import java.util.Scanner;

public class Patient {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the patient name :");
        String name = sc.nextLine();
        System.out.print("Enter bloodgroup :");
        String Bloodgroup = sc.nextLine();
        System.out.print("Enter Weight :");
        int weight = sc.nextInt();
        System.out.println("Patient Registered");
    }
    
}
