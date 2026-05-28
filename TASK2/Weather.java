import java.util.Scanner;
public class Weather {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature:");
        int temp = sc.nextInt();
        if(temp > 35){
            System.out.println("Very Hot");
        }
        else if (temp >25){
            System.out.println("Pleasant weather");
        }
        else if (temp >15){
            System.out.println("Cool weather");
        }
        else{
            System.out.println("Very Cold");
        }

        }
    
    }
    

