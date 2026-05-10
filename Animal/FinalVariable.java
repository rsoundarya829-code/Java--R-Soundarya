
public class FinalVariable {
    public static void main(String args[]){
        final int x = 10;
        //x = 20; //Error: Cannot assign a value to final variable 'x'
        System.out.println("Value of x: " + x);
        //trying to change final variable x=20;
        x=20;
        System.out.println("New value"+x);

    }
}