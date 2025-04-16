import java.util.*;

public class stringTransform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int moves=0, i=0;
        while(i<s.length()) {
            if(s.charAt(i) == 'X' || s.charAt(i) == 'x') {
                moves++;
                i+=3;
            } else {
                i++;
            }
        }
        System.out.print("Minimum number of moves required: " + moves);
        sc.close();
    }
}