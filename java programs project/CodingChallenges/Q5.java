import java.util.Scanner;
class Q5{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int[] marks = new int[5];
        
        for(int i=0;i<=4;i++) {
            marks[i] = scan.nextInt();
        }
        
        System.out.println("The Numbers Are:");
        
        for(int i=0;i<=4;i++){
            System.out.println(marks[i]);
        }

    }
}
//the second for loop working:
        //System.out.println(marks[0]);
        //System.out.println(marks[1]);
        //System.out.println(marks[2]);
        //System.out.println(marks[3]);
        //System.out.println(marks[4]);