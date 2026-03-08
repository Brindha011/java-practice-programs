import java.util.Scanner;
class Q8{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] details = new int[size]; 


        for(int i=0;i<=size-1;i++) {
            
            details[i] = scan.nextInt();
        }

        int middleindex = (size)/2;
        System.out.println(details[middleindex]);
    
}
}

        
        