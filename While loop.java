import java.util.*;

class HelloTillStop {
    Scanner sc = new Scanner(System.in);

    // Outputs "Hello" while the user wants to
    void showHello() {
        String choice; // guard variable

        System.out.println("For Hello type 'h', anything else to stop");
        choice = sc.next(); // set guard variable

        while ("h".equals(choice)) { // check guard
            System.out.println("Hello");
            choice = sc.next(); // update guard variable
        }
    }

    public static void main(String[] args) {
        HelloTillStop obj = new HelloTillStop();
        obj.showHello();
    }
}
