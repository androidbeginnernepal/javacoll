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
public class BufferWriter 
{
    public static void main(String[] args)
    {
        //String fileName="//home//anuj//file_test.txt";
                try
                {
                    String myText="";
                    BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
                    //BufferedWriter writer=new BufferedWriter(new FileWriter(fileName,true));
                   System.out.println("Enter the First Line");//user sanga input mageko
                    myText=br.readLine();
                    FileWriter writer=new FileWriter("//home//anuj//file_test.txt",true);
                    writer.write(myText);
                   // writer.newLine();
                    //writer.write(myText);
                    writer.close();
                }
                catch(IOException e)
                {
                    e.printStackTrace();
                }
    }
}
