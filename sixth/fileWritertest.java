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
public class fileWritertest
{
    public static void main(String [] args)
    {
        
    
            
        String fileName="//home//anuj//file_test.txt";

        try 
        {
            FileWriter writer=new FileWriter(fileName,true);
            writer.write("tesst texsssrt/n");
            writer.append("second text");
            writer.close();
            System.out.print("writern to file");
         }
        catch(IOException e)
            {
                e.printStackTrace();
        
            }
        }      
}

