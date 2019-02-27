package Day_14;

import java.util.Scanner;

public class Scope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }

}

class Difference{
    private int[] elements;
    public int maximumDifference;

    Difference(int[] elements){
        this.elements = elements;
    }

    void computeDifference() {
        int temElm = elements[0];
        int[] tempRslt = new int[100000];

        for (int i = 0; i < elements.length; i++) {
//            tempRslt = temElm - elements[i+1];
        }
    }
}
