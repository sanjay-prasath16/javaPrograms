import java.util.*;

public class findingX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.print("Enter the array elements: ");
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        int length = N+1, actualSum=0;
        int totalSum = length*(length+1)/2;
        for(int num:arr) {
            actualSum+=num;
        }
        System.out.print("Missing number is: " + (totalSum-actualSum));
        sc.close();
    }
}
