import java.util.Scanner;

public class Iteration {
    public static void test() {
        System.out.print("Enter for n-th iteration:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" "+i+" ");
            }
        }
    }
}
