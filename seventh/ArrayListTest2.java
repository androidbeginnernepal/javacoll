/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package seventh;

/**
 *
 * @author anuj
 */
import java.util.*;
public class ArrayListTest2 
{
    public static void main(String [] args)
    {
        try
        {
        Scanner s=new Scanner(System.in);
        
        ArrayList<Integer> n=new ArrayList<Integer>();

        for(int i=0;i<3;i++)
        {
            //for(int j=0;j<3;j++)
                
            //{
                n.add(s.nextInt());
           // }
            
        }
        Collections.sort(n);
        //System.out.println("the numbers in array is "+n.get(1));
        for(int i=0;i<3;i++)
        {
            
            {
                System.out.print(n.get(i));
            }
        }
        }
        catch(Exception c)
        {
           System.out.println("the error"+c.toString()); 
        }
        System.out.println("ball bhayo");
                
    }
}
