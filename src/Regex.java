import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    public static void test()
    {
        System.out.print("Enter a character:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(Pattern.matches("[a-z]",s))
        {
            System.out.println("Small case letter");

        }else if(Pattern.matches("[A-Z]",s))
        {
            System.out.println("Capital Letter");
        }else if(Pattern.matches("[0-1]",s))
        {
            System.out.println("Digits");
        }else
        {
            System.out.println("Special Character");
        }
    }
}
