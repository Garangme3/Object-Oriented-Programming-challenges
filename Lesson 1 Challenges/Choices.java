import java.util.Scanner;

public class Choices {
    void numberCheck(){
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Enter a number between 1 and 50");
        number = sc.nextInt();

        if (number >= 1 && number <= 50) {
            if (number % 2 == 0) {
                System.out.println("The number is within 1 and 50 and is even");
            }
            else {
                System.out.println("The number is within 1 and 50 and is odd");
            }
        }
        else {
            System.out.println("The number is not within 1 and 50");
        }
    }
    public static void main(String[] args) {
        (new Choices()).numberCheck();
    }
}
