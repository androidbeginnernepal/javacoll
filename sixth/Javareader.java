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
public class Javareader 
{
    public static void main(String [] args)
    {
        //try
        {
            int a,b,c=10;
            a=b=c=10;
            System.out.print("value of b is: "+b);
            
            File f=new File("//home//anuj//file_test.txt");
            System.out.println("file name="+f.getName());
            System.out.println("path:"+f.getPath());
            System.out.println("avs"+f.getAbsolutePath());
            System.out.println("parent"+f.getParent());
            System.out.println("exists"+f.exists());
        
        if(f.exists())
        {
            System.out.println("is writable"
                    + f.canWrite());
            System.out.println("is readable"+f.length());
            
        
        
        }
       }
    }
    }
