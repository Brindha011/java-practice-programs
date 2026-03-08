import java.util.Scanner;
class numposorneg{
    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        System.out.print("Enter the number for finding the num positive or negative:");
        int a = scan.nextInt();
        if(a>0 ) {
            System.out.print("The number is positive");
        }
        else if(a==0){
            System.out.print("The number is zero");
        }
        else{
            System.out.print("The number is negative");
        }
    }
}