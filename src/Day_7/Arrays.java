package Day_7;

import java.util.Scanner;

public class Arrays {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int j = n;
        int[] arr = new int[n];
        int[] reverse_arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        for (int k = 0; k < n; k++) {
            reverse_arr[j-1] = arr[k];
            j-=1;
        }

        for (int l = 0; l < n; l++) {
            System.out.print(reverse_arr[l] + " ");
        }

        scanner.close();
    }
}
