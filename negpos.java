/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anuj
 */
import java.util.Scanner;

public class negpos
{
    public static void main(String [] args)
       {
           int a;
           System.out.print("enter");
           Scanner s=new Scanner(System.in);
           a=s.nextInt();
           if(a<0)
            {
               System.out.print("the number is negative");
              
            }
           else if(a>0)
               System.out.print("the number is positive");
           else
                System.out.println("the number is neither pos nor neg");
                  
       }
}
