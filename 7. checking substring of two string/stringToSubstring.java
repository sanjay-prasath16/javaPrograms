import java.util.*;

public class stringToSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String A = sc.nextLine();
        System.out.print("Enter the second string: ");
        String B = sc.nextLine();
        boolean result = isSubstring(A, B);
        System.out.println(result ? "A is subsequence of B" : "A is not subsequence of B");
        sc.close();
    }

    public static boolean isSubstring(String A, String B) {
        int i=0, j=0;
        while(i < A.length() && j < B.length()) {
            if(A.charAt(i) == B.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == A.length();
    }
}