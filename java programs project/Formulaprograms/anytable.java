import java.util.Scanner;
class anytable {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(i+"*"+n+"="+i*n);
        }

    }
}