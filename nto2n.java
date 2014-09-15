/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/** 
 *
 * @author anuj
 */
import java.util.Scanner;

public class nto2n

{
    public static void main(String [] args)
    {
        
    
        int i,j,sum=0,n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the num");
        n=s.nextInt();
         if(n>0)
         {
             for(i=n;i<2*n;i++)
                 {
                      sum+=n;
                 }
         }
         else if(n<0)
         {
             for(i=2*n;i>n;i--)
               {
                sum=+n;
               }
         }
        else
         {
             System.out.println("the num is 0");
         }
         

             
       
       System.out.println("the sum is "+sum);
    }
}