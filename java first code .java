import java.util.Scanner;

public class VotingEligibility {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote in a national election.");
        } else {
            System.out.println("You are not yet eligible to vote in a national election.");
        }
    }
}
