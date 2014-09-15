/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sixth;

/**
 *
 * @author anuj
 */
import java.io.*;
public class dirtest
{
    public static void main(String [] args)
    {
        String dirname="/home/anuj";
        File f1=new File(dirname);
        if(f1.isDirectory())
        {
            System.out.println("directory of"+dirname);
            String s[]=f1.list();
            for(int i=0;i<s.length;i++)
            {
                File f=new File(dirname+"/"+s[i]);
                if(f.isDirectory())
                {
                    System.out.print(s[i]+"is directoru");
                    
                    
                }
                else 
                {
                    System.out.println(s[i]+"is a file");
                }
            }
        }
            else 
        {
            System.out.println("it is not a directory");
        }
            
          
        
    }
    
}

