import java.util.*;

public class findUniqueElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int N = sc.nextInt();
        System.out.print("Enter the array elements: ");
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The single unique element is: " + indistinctElement(arr));
        sc.close();
    }
    public static int indistinctElement(int[] arr) {
        int ones=0, twos=0;
        for(int num:arr) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }
        return ones;
    }
}