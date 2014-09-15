/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fourth;

/**
 *
 * @author anuj
 */
public class AbstractClassTest 
{
    public static void main(String [] args)
    {
        ChildClass cc =new ChildClass();
        cc.myMethod1();
        cc.myMethod2();
     
        
    }
    
    
}
abstract class AbsClass

{
    public int a;

    public abstract void myMethod1();
  {
        System.out.println("anuj");
        
    }
    void myMethod2()
    {
        System.out.println("this is methid anuj20");
    }
}
class ChildClass extends AbsClass
{

    public void myMethod1()
    {
        System.out.println("my method is of abs is overriddern in clas");
        
    }
    
}