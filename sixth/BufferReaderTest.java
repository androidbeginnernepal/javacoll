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
public class BufferReaderTest 
{
    public static void main(String[] args)
    {
        //String fileName="//home//anuj//file_test.txt";
        String LS=System.getProperty("line.separator");
        StringBuffer fileContent=new StringBuffer();
        try
        {
            FileReader fr=new FileReader("//home//anuj//file_test.txt");
            BufferedReader reader=new BufferedReader(fr);
            String line="";
            while((line=reader.readLine())!=null)
            {
                fileContent.append(line).append(LS);
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        System.out.println(fileContent);
        
        
        }
    }

