/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package packageRadha;

/**
 *
 * @autblichor anuj
 */
class MyExceptionTest
        {
public static void main(String[] args)
{
    try
    {
        compute(1);
        compute(20);
    }
    catch(MyException e)
    {
         e.printStackTrace();
    }
}
static void compute(int a)throws MyException
{
    System.out.println("called with value"+a);
    if(a>10)
        throw new MyException(a);
    
}
}
class MyException extends Exception
{
    private int n;
    MyException(int a)
    {
        n=a;
    }
    
    
   public String toString()
    {
        return"MyException["+n+"]";
    }
    
   
}
