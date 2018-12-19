import java.util.Scanner;

public class RevString
{
    public static void test()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        String reverse=" ";
        for(int i=s.length()-1;i>=0;i--)
        {
            reverse += s.charAt(i);
        }
        System.out.println(reverse);
    }
}
