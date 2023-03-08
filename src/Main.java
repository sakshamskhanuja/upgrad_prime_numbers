import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        primesLessThanOrEqualTon(n);
    }

    // Method to print all primes less than or equal to n in ascending order
    static void primesLessThanOrEqualTon(int n) {
        // Represents whether any prime numbers have been found yet.
        boolean primeNumbersFound = false;

        // Finds and prints prime numbers.
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                primeNumbersFound = true;
                System.out.print(i + " ");
            }
        }

        // Checks if there are no prime numbers to be found.
        if (!primeNumbersFound) {
            System.out.println("There are no prime numbers less than or equal to " + n);
        }
    }

    /**
     * Checks whether a give number is a prime number or not.
     */
    private static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
