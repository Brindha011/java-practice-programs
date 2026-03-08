import java.util.Scanner;
class inpout{
    public static void main(String args[])
    { 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = input.nextLine();
        System.out.print("Enter your age:");
        int age = input.nextInt();
        input.nextLine();
        System.out.print("Enter your college name:");
        String clg = input.nextLine();
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("College:"+clg);
    }
}