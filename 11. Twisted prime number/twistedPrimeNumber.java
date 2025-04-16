import java.util.*;

public class twistedPrimeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        int count = 0, reversed = 0;
        if(checkIsPrime(N)) {
            count += 1;
        }
        while(N!=0) {
            int digit = N%10;
            reversed = reversed*10+digit;
            N/=10;
        }
        if(checkIsPrime(reversed)) {
            count += 1;
        }
        System.out.print(count==2 ? "1" : "0");
        sc.close();
    }
    public static boolean checkIsPrime(int n) {
        if(n<=1) return false;
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n%i==0) return false;
        }
        return true;
    }
}
