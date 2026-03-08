//TO GENERATE A PARTICULAR RANDOM NUMBER USING WHILE LOOP

import java.util.Random;
class randomandwhile {
    public static void main(String args[]) {
        Random Rand = new Random();
        int random = 0;

//HERE THE WHILE IS USED TO PREDICT AND STOP THE LOOP OPERATION AND USED TO CHECK THE CONDITION
//WHICH WILL CHECK THE GENERATED NUM BY NOT EQUAL WITH SOME NUM EX:7 FROM 0 UPTO 11 WHICH MEANS 10
//SO THAT,AFTER PARTICULAR NUM IS GENERATED THEN THE LOOP IS TERMINATED!!!

        while(random!=7) {
            random = Rand.nextInt(11);
            System.out.println(random);
        }

    }
}