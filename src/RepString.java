import java.util.Scanner;

public class RepString
{
    public static void test()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        System.out.println("Enter Number to repeat: ");
        int n = sc.nextInt();
        System.out.print(s);
        String str = s.substring((s.length())-n);
        for(int i=0; i<n ; i++)
        {
            System.out.print(str);
        }

    }
}
