import java.util.Scanner;

public class exercise2 {
    public static void main(String[]args){
        //exercise 2
        //write a java program that compares 2 numbers entered by user

        Scanner reader = new Scanner(System.in);
        System.out.println("enter the first number:");
        int x= reader.nextInt();
        Scanner reader1 = new Scanner(System.in);
        System.out.println("enter the second number:");
        int y= reader.nextInt();

        if (x>y){
            System.out.println(x+" IS GREATER THAN "+y);
        }else if(y>x){
            System.out.println(x+" IS LESS THAN "+y);
        }else{
            System.out.println(x+" IS EQUAL TO "+y);
        }

    }
}
