import java.util.Scanner;
public class Sceretnumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int Sceretnumber = 7;
        System.out.print("Enter the number:");
        int number = sc.nextInt();
        if(number == Sceretnumber){
            System.out.println("Correct Guess");
        }
        else {
            System.out.println("Wrong Guess");
        }
    }
    
}
