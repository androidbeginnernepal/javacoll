/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fourth;

/**
 *
 * @author anuj
 */
public class constructorMultilevelheritance
{
    public static void main(String [] args)
    {
        C c =new C();
        
    }
}
    class A
{
    A()
    {
      System.out.println("inidess A's constructior") ;
      
    }
    
}
class B extends A
{
    B()
    {
        System.out.println("inside b's ");
        
    }
}
class C extends B
{
    C()
    {
        System.out.println("insides c's ");
        
    }

}

