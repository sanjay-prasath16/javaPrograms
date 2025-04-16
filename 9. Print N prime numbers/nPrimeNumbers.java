import java.util.*;

public class nPrimeNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();
        System.out.print("The prime numbers between " + N + " numbers are: ");
        for(int i=2; i<=N; i++) {
            if(checkIsPrime(i)) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }

    public static boolean checkIsPrime(int N) {
        for(int i=2; i<=Math.sqrt(N); i++) {
            if(N%i == 0) return false;
        }
        return true;
    }
}