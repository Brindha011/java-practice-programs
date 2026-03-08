import java.util.Scanner;
class Q6 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int[] num=new int[10];

        for(int i=0;i<=9;i++) {
            num[i] = scan.nextInt();
        }

        System.out.println("The Numbers Are:");
        
        for(int i=0;i<=9;i++) {
            System.out.println(num[i]);

        }
    }
}