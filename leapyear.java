/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anuj
 */
import java.util.Scanner;
public class leapyear
{
    public static void main(String [] args)
    {
        int year;
        System.out.println("enter the year");
        Scanner s=new Scanner(System.in);
        year =s.nextInt();
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    System.out.println("its leap year");
                }
            }
        }
        else
            {
                System.out.println("its not leap yr");
            }
    }
}
