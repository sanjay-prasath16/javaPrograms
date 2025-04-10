import java.util.*;

public class sortDesAsc {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many elements to be stored in the array: ");
        n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> evenArr = new ArrayList<>();
        ArrayList<Integer> oddArr = new ArrayList<>();
        System.out.println("Enter the array elements: ");
        for(int i=0; i<n; i++) {
            int num = sc.nextInt();
            arr.add(num);
        }
        Collections.sort(arr);
        for(int num:arr) {
            if(num % 2 == 0) {
                evenArr.add(num);
            } else {
                oddArr.add(num);
            }
        }
        Collections.reverse(oddArr);
        oddArr.addAll(evenArr);
        System.out.print("Output array:");
        for(int num:oddArr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}