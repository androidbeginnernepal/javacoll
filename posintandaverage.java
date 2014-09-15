/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anuj
 */
import java.util.Scanner;

public class posintandaverage 
{
    public static void main(String [] args)
    {
       int i,sum=0,n;
       float avg=0f;
       for(i=0;i<4;i++)
       {
             System.out.println("enter the numbers");
             Scanner s=new Scanner(System.in);
                n=s.nextInt();
          
       
           
           if(n>0)
           {
               sum=sum+n;
               
           }
           
       }
       avg=sum/4;
       System.out.println("the sum is "+sum);
      System.out.println("the average is "+avg);
       
       
    }
}
