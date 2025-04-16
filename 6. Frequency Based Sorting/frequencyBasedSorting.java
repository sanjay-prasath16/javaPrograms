import java.util.*;

public class frequencyBasedSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number of test cases: ");
        int T = sc.nextInt();
        while (T-- > 0) {
            System.out.println("Enter how many elements to be entered into the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the array elements: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            HashMap<Integer, Integer> freqMap = new HashMap<>();
            for (int num : arr) {
                freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            }
            List<Integer> list = new ArrayList<>();
            for (int num : arr) {
                list.add(num);
            }
            Collections.sort(list, new Comparator<Integer>() {
                public int compare(Integer a, Integer b) {
                    int freqA = freqMap.get(a);
                    int freqB = freqMap.get(b);
                    if (freqA != freqB) {
                        return freqB - freqA;
                    } else {
                        return a - b;
                    }
                }
            });
            for (int num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}