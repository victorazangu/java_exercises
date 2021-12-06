import java.util.Scanner;

public class exercise3
{
    public static void main(String[]args)
    {
        //exercise 3
        //write a java program that compute the sum of digits of a number
        //example :number :27 -->sum of digits :9

        Scanner reader = new Scanner(System.in);
        System.out.println("enter the munber to sum its digits: ");
        int num=reader.nextInt();
     int sum =0;
     while (num !=0)
     {
         sum= sum+num%10;
         num=num/10;
     }
        System.out.print(sum);


    }
}
