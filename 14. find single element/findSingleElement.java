import java.util.*;

public class findSingleElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int N1 = sc.nextInt();
        int[] arr = new int[N1];
        System.out.print("Enter the array elements: ");
        for(int i=0; i<N1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The unique element is: " + uniqueElement(arr));
        sc.close();
    }
    public static int uniqueElement(int[] arr) {
        int left=0, right=arr.length-1;
        while(left<right) {
            int mid = left + (right - left) / 2;
            if(mid%2 == 1) {
                mid--;
            }
            if(arr[mid] == arr[mid + 1]) {
                left = mid + 2;
            } else {
                right = mid;
            }
        }
        return arr[left];
    }
}