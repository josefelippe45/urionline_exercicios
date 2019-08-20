package pkg1173;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] N = new int[10];
        int X = sc.nextInt();
        N[0] = X;
        for (int i = 1; i < N.length; i++) {
            N[i] += N[i-1] * 2;
        }
        for (int i = 0; i < N.length; i++) {
            System.out.printf("N[%d] = %d\n", i, N[i]);
        }
    }
    
}
