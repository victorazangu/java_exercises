import java.util.Scanner;

public class strings {
    public static void main(String[]args){


       // write a java program that allows
        //the user to enter 10 numbers and gives their sum

        //either this 1

        Scanner reader = new Scanner(System.in);
        System.out.println("enter number one:");
        int one= reader.nextInt();

        Scanner reader1 = new Scanner(System.in);
        System.out.println("enter number two:");
        int two= reader1.nextInt();

        Scanner reader2 = new Scanner(System.in);
        System.out.println("enter number three:");
        int three= reader2.nextInt();

        Scanner reader3 = new Scanner(System.in);
        System.out.println("enter number four:");
        int four= reader3.nextInt();

        Scanner reader4 = new Scanner(System.in);
        System.out.println("enter number five:");
        int five= reader4.nextInt();

        Scanner reader5 = new Scanner(System.in);
        System.out.println("enter number six:");
        int six= reader5.nextInt();

        Scanner reader6 = new Scanner(System.in);
        System.out.println("enter number seven:");
        int seven= reader6.nextInt();

        Scanner reader7 = new Scanner(System.in);
        System.out.println("enter number eight:");
        int eight= reader7.nextInt();

        Scanner reader8 = new Scanner(System.in);
        System.out.println("enter number nine:");
        int nine= reader8.nextInt();

        Scanner reader9 = new Scanner(System.in);
        System.out.println("enter number ten:");
        int ten= reader9.nextInt();

        if(true){
            int sum= one+two+three+four+five+six+seven+eight+nine+ten;
            System.out.println(sum);
        }

        //or this
         Scanner reader10 = new Scanner(System.in);
         System.out.println("enter 10  numbers :");

         int [] eleven = new int[10];

         for (int i =0;i<eleven.length;i++){
             eleven[i] =reader10.nextInt();
         }
         int sum =0;
         for (int i:eleven){
             sum=sum+i;
         }
         System.out.println(sum);


    }

}
