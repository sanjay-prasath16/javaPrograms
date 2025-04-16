import java.util.*;

public class factorBasedSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count of array elements: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.print("Enter the numbers: ");
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        for(int num:arr) {
            list.add(num);
        }
        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                int fa = countFactors(a);
                int fb = countFactors(b);
                if(fa != fb) {
                    return fa-fb;
                } else {
                    return a-b;
                }
            }
        });
        System.out.println("Sorted result based on factor: " + list);
        sc.close();
    }

    public static int countFactors(int n) {
        int count = 0;
        for(int i=1; i<=Math.sqrt(n); i++) {
            if(n%i==0) {
                count+=2;
                if(i == n/i) count--;
            }
        }
        return count;
    }
}