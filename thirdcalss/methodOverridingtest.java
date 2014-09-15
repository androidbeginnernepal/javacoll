/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdcalss;

/**
 *
 * @author anuj
 */
public class methodOverridingtest
{
    
    public static void main(String[] args)
    {
        Son s1 = new Son();
        s1.worksFor();
    }
}
class Father
{
    
    void worksFor()
    {
        System.out.println("father's office");
    }
}
class Son extends Father
{
    void worksFor()
    {
        System.out.println("son's office");
    }
}
