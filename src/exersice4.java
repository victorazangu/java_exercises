import java.util.Scanner;

public class exersice4
{
    public static void main(String[]args)
    {
        //exercise 5
        //write a java program to display prime numbers from 1 to n(enter by user)

        //getting number from the use

        Scanner reader = new Scanner(System.in);
        System.out.println("enter the number max number: ");
        int n = reader.nextInt();

        int num =0;



        //how to get prime number
        String primeNumber = "";



        for (int i=1;i<=n;i++)
        {
            int counter =0;

            for (num = i ;num >= 1; num--)
            {
                if(i%num == 0)
                {
                    counter++;
                }

            }
            if(counter == 2)
            {
                //appending prime number to the string
                primeNumber = primeNumber + i +" ";
            }
        }
        System.out.println("prime numbers from 1 to " +n+" are: " +primeNumber);




    }
}
