import java.util.*;

public class indistinctValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the count of first array: ");
        int N1 = sc.nextInt();
        System.out.print("Enter the count of second array: ");
        int N2 = sc.nextInt();
        int[] arr1 = new int[N1];
        int[] arr2 = new int[N2];
        System.out.print("Enter the first array elements: ");
         for(int i=0; i<N1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the second array elemetns: ");
        for(int i=0; i<N2; i++) {
            arr2[i] = sc.nextInt();
        }
        findIndistinctValue(arr1, arr2, N1, N2);
        sc.close();
    }
    public static void findIndistinctValue(int[] arr1, int[] arr2, int n1, int n2) {
        int arr2pos = 0;
        System.out.print("The indistinct index is: ");
        for(int i=0; i<n1; i++) {
            if(n2!=0) {
                if(arr1[i] == arr2[arr2pos]) {
                    n2--;
                    arr2pos++;
                } else {
                    System.out.print(i);
                }
            } else {
                System.out.print(i);
            }
        }
    }
}