import java.util.*;

public class leastDivisiblePrime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements to be assigned to first array: ");
        int n1 = sc.nextInt();
        System.out.print("Enter number of elements to be assigned to second array: ");
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        System.out.print("Enter the first array elements: ");
        for(int i=0; i<n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the second array elements: ");
        for(int i=0; i< n2; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] result = new int[n1];
        for(int j=0; j<n1; j++) {
            boolean found = false;
            for(int i=2; i<1000; i++) {
                if(checkIsPrime(i)) {
                    if ((arr1[j] + i) % arr2[j] == 0) {
                        result[j] = i;
                        found = true;
                        break;
                    }
                }
            }
            if (!found) {
                result[j] = -1;
            }        
        }
        System.out.print("The least divisible prime numers are: ");
        for(int num:result) {
            System.out.print(num + " ");
        }
        sc.close();
    }

    public static boolean checkIsPrime(int n) {
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n%i==0) return false;
        }
        return true;
    }
}