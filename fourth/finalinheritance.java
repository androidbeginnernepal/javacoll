/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fourth;

/**
 *
 * @author anuj
 */
public class finalinheritance 
{
}
    

 final class D
{
    final void meth()
    {
        System.out.print("thi is final method");
        
    }
}
class M extends D// d is finaled so cnnot be inherited
{
     void meth();
    {
        System.out.print("overridden");
    }
}
final class N extends M
{
    
}


