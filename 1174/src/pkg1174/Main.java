package pkg1174;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        float[] A = new float[10];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextFloat();
        }
        for (int i = 0;i < A.length; i++){
             if (A[i] <= 10) {
               System.out.printf("A[%d] = %.1f\n", i, A[i]);
            }
        }
    }
}
    

