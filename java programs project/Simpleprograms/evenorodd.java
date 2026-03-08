import java.util.Scanner;
    class evenorodd{
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the number for finding the num even or odd:");
            int a = scan.nextInt();
            if(a%2==0){
                System.out.print("The number is even");
            }
            else{
                System.out.print("The number is odd");
            }
        }
    }

