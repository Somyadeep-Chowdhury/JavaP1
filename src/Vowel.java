import java.util.Scanner;

public class Vowel {
    public static void test() {
        System.out.println("Enter String");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char arr[] = s.toCharArray();
        for(char c: arr)
        {
            if(c =='a' || c =='e' || c == 'i' || c =='o' || c == 'u')
            {
                System.out.println("Vowel");
            }else
            {
                System.out.println("Consonant");
            }
        }
    }

}
