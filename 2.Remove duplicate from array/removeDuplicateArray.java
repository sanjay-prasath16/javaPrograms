import java.util.*;
public class removeDuplicateArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to be stored in array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements which should be stored in array: ");
        for(int i=0; i<n ; i++) {
            nums[i] = sc.nextInt();
        }
        Set<Integer> digitNum = new HashSet<>();
        for(int num:nums) {
            while(num > 0) {
                digitNum.add(num%10);
                num/=10;
            }
        }
        for(int digit:digitNum) {
            System.out.println(digit + " ");
        }
        sc.close();
    }    
}
