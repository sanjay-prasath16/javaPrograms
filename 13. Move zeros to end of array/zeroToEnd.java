import java.util.*;

public class zeroToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.print("Enter the array elements: ");
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        moveZerosToEnd(arr);
        System.out.print("Resultant array: ");
        for(int num:arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
    public static void moveZerosToEnd(int[] arr) {
        int nonZerosPos = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 0) {
                arr[nonZerosPos] = arr[i];
                nonZerosPos++;
            }
        }
        while(nonZerosPos < arr.length) {
            arr[nonZerosPos] = 0;
            nonZerosPos++;
        }
    }
}
