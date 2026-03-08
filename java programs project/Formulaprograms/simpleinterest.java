import java.util.Scanner;
class simpleinterest{
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the value of Principal amount(P):");
        float P = scan.nextFloat();
        System.out.print("Enter the Time in years(T): ");
        float T = scan.nextFloat();
        System.out.print("Enter the Rate of Interest(R):");
        float R = scan.nextFloat();
        float SI = (P * T * R)/100;
        System.out.print("The Simple Interest = "+SI);

    }
}