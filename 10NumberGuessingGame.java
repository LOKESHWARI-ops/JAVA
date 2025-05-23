import java.util.*;
public class NumberGuessingGame {
    public static void main(String[] args) {
        int num = new Random().nextInt(100)+1;
        int guess;
        do {
            guess = new Scanner(System.in).nextInt();
            System.out.println(guess<num?"Too low":guess>num?"Too high":"Correct!");
        } while(guess!=num);
    }
}
