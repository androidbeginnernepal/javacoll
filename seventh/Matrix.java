/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seventh;

/**
 *
 * @author anuj
 */
import java.util.Scanner;
public class Matrix 
{
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("enter the number of index");
        n=s.nextInt();//n gives size of index
        String[][] myarr=new String[n][n];//multivalue array 2d
        
        System.out.println("enter the numbers in array");
        for(int i=0;i<myarr.length;i++)//myaray.length le array ko length check 
        {   
           
         
        
                for(int j=0;j<myarr.length;j++)//yo row euta ko lagi
                    //i row and j column ho;
                {
                    myarr[i][j]=s.next();
                }
        }
                   System.out.println("the the required matrix is ");
       
        for(int i=0;i<myarr.length;i++)
        {
            for(int j=0;j<myarr.length;j++)
            {
                
                System.out.print(myarr[i][j]+" ");
            }
            System.out.print("\n");
        }
        
    }
}
