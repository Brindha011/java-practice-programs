import java.util.Scanner;
class swapwithout{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a = scan.nextInt();
        System.out.print("Enter the value of b:");
        int b = scan.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("The value of a is:" +a);
        System.out.println("The value of b is:" +b);
    }
}