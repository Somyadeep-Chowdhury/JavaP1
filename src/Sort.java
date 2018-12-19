import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sort
{
    public static void test()
    {
        int num[]= new int[5];
        int sum=0,temp;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number using space:");
        for(int i=0;i<5;i++)
        {
            num[i] = sc.nextInt();
        }
        for(int i=0;i<5 ; i++)
        {
            if(num[i]%2==0)
            {
                sum += num[i];
            }
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if(num[i] < num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        for(int k=0;k<5;k++)
        {
            System.out.println(+num[k]);
        }
        System.out.println("Sum of even numbers: "+sum);
        if(sum>15)
        {
            System.out.println("True");
        }else
        {
            System.out.println("False");
        }

    }
}
