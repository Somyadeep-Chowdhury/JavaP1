import java.util.Scanner;

public class Palindrome
{
    public static void isPalindrome()
    {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rev=0,add=0;
        for (int i=n;i>0;i/=10)
        {
            rev = (rev*10)+(i%10);
        }

        if(n==rev)
        {
            while(rev>0)
            {
                if ((rev%10)%2==0)
                {
                    add=add+(rev%10);
                }
                rev/=10;
            }
            if (add>25)
                System.out.println(n+" is palindrome and greater than 25");
            else
                System.out.println(n+" is palindrome and less than 25");
        }
        else
        {
            System.out.println(n+" Is Not Palindrome");
        }
    }
}
