import java.util.Scanner;
class greatestof2num{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a = scan.nextInt();
        System.out.print("Enter the value of b:");
        int b = scan.nextInt();
        if(a>b) {
            System.out.print("The value of a is greater than b");
        }
        else{
            System.out.print("The value of b is greater than a");
        }
    }
}
    