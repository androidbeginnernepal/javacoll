/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package packageRadha;

/**
 *
 * @author anuj
 */
import java.io.*;

public class excpTest 
{
    public static void main(String[] args)
    {
        try
        {
            int a[]=new int[2];
            System.out.println("acces element three"+a[3]);
            
            
        }
        /*catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Anju");
        }*/
        catch(Exception e)
        {   
                
                {
                    System.out.print("exception thrown\n"+e);
                    
               }
        }
        
        
        
        System.out.println("\nthis is last line");
        }
    
    }
}