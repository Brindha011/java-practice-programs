//GET INPUT FOR VARIABLE A.INPUT SHOULD BE GREATER THAN 10 & IF INPUT IS NOT GREATER THAN 10 
//ASK THE USER TO RE-ENTER UNTILL HE TYPES THE RIGHT INPUT


import java.util.Scanner;

class EXdowhile {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        int count=0;

        do{
            System.out.print("Enter the number greater than 10: ");
            count = scan.nextInt();
            count++;

        }while(count<=10); 

        //HERE THE LESS THAN SYMBOL IS USED SO LESS THAN IS USED SO THAT IT BREAK
        //THE LOOP,EX IF THE GIVEN NUM IS 4 WHICH IS SMALL THAN 10 SO THAT THE CONDITION IN WHILE 
        //LOOP IS TRUE SO THAT IT CONTINUES THE LOOP,IF IT IS ABOVE THE VALUE 10 THEN THE LOOP
        //BREAKS DUE TO THE NEGATIVE CONDITION IN THE WHILE SO THAT IT TERMINATES
    }

}