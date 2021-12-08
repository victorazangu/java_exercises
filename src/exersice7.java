import java.util.Scanner;

public class exersice7 {
    public static void main(String[]args){

        //exercise 7
        //write a java program that allows the use to enter
        //10 numbers and gives their avarage

        Scanner reader = new Scanner(System.in);
        System.out.println("enter the 10 numbers :");

        int [] avarage = new int[10];

        for(int i=0;i<avarage.length;i++){
            avarage[i]=reader.nextInt();
        }
        int sum =0;
        double avar=0;
            for (int i:avarage){
                sum=sum+i;

            }
        avar=sum/avarage.length;

        System.out.println("the average is: "+avar);



    }
}
