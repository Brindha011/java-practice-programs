//TO  GENERATE A RANDOM NUMBER
import java.util.Random;
class randomnum {
    public static void main(String args[]) {
        Random rand = new Random();
        int random = rand.nextInt(10);
        System.out.println(random);
    }
}