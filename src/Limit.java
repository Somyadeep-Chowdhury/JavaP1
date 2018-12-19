import java.util.Scanner;

public class Limit {
    public static void test() {
        int target = 22,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check:");
        while ((n = sc.nextInt())>0){

            if (n > target) {
                System.out.println("Number guessed is more than original number");
            } else if (n < target) {
                System.out.println("Number guessed is less than original number");
            } else if (n == target) {
                System.out.println("Number guessed matches the original number");
                break;
            }

        }
    }
}
