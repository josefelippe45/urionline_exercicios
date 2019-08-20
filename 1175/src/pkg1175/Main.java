package pkg1175;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aux = 0;
        int i;
        int N[] = new int[20];
        for (i = 0; i < N.length; i++) {
            N[i] = sc.nextInt();

        }
        for (i = 0; i < N.length / 2; i++) {

            aux = N[i];
            N[i] = N[(N.length - 1) - i];
            N[(N.length - 1) - i] = aux;

        }
        for (i = 0; i < N.length; i++) {
            System.out.printf("N[%d] = %d\n", i, N[i]);
        }
    }
}
