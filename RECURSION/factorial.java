public class factorial {
    public static int factorial(int n) {
        //Base Case
        if (n==0 || n==1) {
            return 1;
        } else {
            // Recursive case: n * factorial of (n-1)
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        int result = factorial(6); // Calculates the factorial of 6
        System.out.println("Factorial: " + result); // Output: Factorial: 720
    }
}
