import java.util.Scanner;
class Q7{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        int[] table =  new int[10];

        for(int i=0;i<=9;i++) {
            
            table[i] = scan.nextInt();
            
        }
        System.out.println("The Two Table is:");
        
        for(int i=0;i<=9;i++){
        
        System.out.println(table[i]+"*2="+table[i]*2);
        }

    }
}