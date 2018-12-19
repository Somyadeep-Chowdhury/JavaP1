import java.util.Scanner;

public class TomJerry
{
    public static void test()
    {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n>=20 && n<=30)
        {
            if(n%2==0)
            {
                System.out.println(n+" is even");
            }else{
                System.out.println(n+" is odd");
            }
        }else{
            System.out.println("Number is not in range");
        }

    }
}
