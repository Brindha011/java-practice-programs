import java.util.Scanner;
class Q1{
    public static void main(String args[]) {
       Scanner scan = new Scanner(System.in);
       System.out.print("Number 1:");
       int a = scan.nextInt();
       System.out.print("Number 2:");
       int b = scan.nextInt();
       for(int i=a;i<=b;i++)
       {
        System.out.println(i);
       }
    }
}
