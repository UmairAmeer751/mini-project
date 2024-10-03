
import java.util.Scanner;
public class projectjava {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // used for taking input from user
        int myNumber = (int)(Math.random() * 100); // taking random number & typecasting
        int userNumber;
        boolean flag;
        do {
            System.out.println("Guess my number(1-100) : ");
            userNumber = sc.nextInt(); // take input from the user
            if(userNumber<=0){
                System.out.println("you lose");
                System.out.println("my number was ");
                System.out.println(myNumber);
                return;
            }

            if (userNumber == myNumber) {
                System.out.println("wow! You guess right number .");
                flag = true;
                break;
            } else if (userNumber > myNumber) {
                System.out.println("You guess a high number ");
            } else {
                System.out.println("You guess a small number ");
            }
        } while (true);
        System.out.println("You Guessed it right.");
        sc.close();
    }
}