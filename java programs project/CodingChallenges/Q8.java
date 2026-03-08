import java.util.Scanner;
class Q8{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] table =  new int[10];

        for(int i=0;i<=9;i++) {
            
            table[i] = scan.nextInt();
            
        }
        
        System.out.println("The Two Table is:");
        
        for(int i=0;i<=9;i++){
        
        System.out.println(table[i]+"*"+n+"="+table[i]*n);

        }

    }
}