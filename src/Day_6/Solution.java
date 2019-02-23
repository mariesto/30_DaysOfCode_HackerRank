package Day_6;

import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        String[] evenWords = new String[10000];
        String[] oodWords = new String[10000];
        String[] words = new String[n];
        String[] checkWords = new String[n];

        for (int i=0; i<n; i++){
            words[i] = scanner.next();

            for (int j = 0; j < words[i].length(); j++) {
                if(j%2==0){
                    evenWords[i] += words[i].charAt(j);
                }else{
                    oodWords[i] += words[i].charAt(j);
                }
                checkWords[i] = evenWords[i] + " " + oodWords[i];
            }
            System.out.println(checkWords[i].replace("null", ""));
        }
    }
}
