package Day_10;

import java.util.Scanner;

public class BinaryNumbers {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        numToBiner(n);

        scanner.close();
    }

    static void numToBiner(int n) {
        int[] binaryNum = new int[10000];
        int i = 0, check=0;

        while (n > 0){
            binaryNum[i] = n%2;
            n /= 2;
            i++;
        }

        for (int j = i - 1; j >= 0; j--)  {
//            System.out.println(binaryNum[j]);
            if(binaryNum[j] == 1 && binaryNum[j+1] == 1){
                check++;
            }
        }

        System.out.println(check);
    }
}
