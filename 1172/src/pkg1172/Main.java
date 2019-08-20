package pkg1172;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] X = new int[10];
        for (int i = 0; i < X.length; i++) {
            X[i] = sc.nextInt();
            if (X[i] < 1) {
                X[i] = 1;
            }

        }
        for (int i = 0; i < X.length; i++) {
            System.out.printf("X[%d] = %d\n", i, X[i]);
        }
    }
}
