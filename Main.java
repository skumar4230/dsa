import java.util.Scanner;

public class Main {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;

            }
        }
        return true;
    }

    // public static void main(String[] args) {
    // Scanner sc=new Scanner(System.in);
    // System.out.println("Enter the number:");
    // int n=sc.nextInt();
    // if(isPrime(n)){
    // System.out.println(n + " is a prime number.");
    // }else{
    // System.out.println(n + " is not a prime number.");
    // }
    // }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide your number");
        int a = sc.nextInt();
        System.out.println("Prime numbers upto " + a + "are: " + " ");

        for (int i = 2; i <= a; i++) {
            if (isPrime(a)) {
                System.out.println(a + " is prime number.");
            } else {
                System.out.println(a + " is not prime");

            }

            sc.close();

        }

    }
}