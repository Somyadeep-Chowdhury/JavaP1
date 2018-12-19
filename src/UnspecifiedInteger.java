import java.util.Scanner;

public class UnspecifiedInteger {
    public static void test()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers to add and press 0 to exit:");

        int n, sum=0;
        while ((n=sc.nextInt())!=0)
        {
            sum += n;
        }

        System.out.println("Sum is "+sum);
    }
}
