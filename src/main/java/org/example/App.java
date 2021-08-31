import java.util.Scanner;
import java.util.Date;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 julian londono
 */

public class App
{
    public static void main( String[] args )
    {
        Date d = new Date();
        Scanner input = new Scanner(System.in);
        int cur_year = d.getYear() + 1900;

        System.out.println("What is your current age?");
        int cur_age = input.nextInt();
        System.out.println( "At what age would you like to retire?");
        int ret_age = input.nextInt();

        System.out.println("You have " + (ret_age-cur_age) + " years left until you can retire.");
        System.out.println("It is " + cur_year + " , so you can retire in " +  (cur_year + (ret_age-cur_age)));

    }
}
