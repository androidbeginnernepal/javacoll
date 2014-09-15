/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdcalss;

/**
 *
 * @author anuj
 */
public class paramaterPass
{
    public static void main(String [] args)
    {
       int a= 7;
       Rectangle r1=new Rectangle(10,5);
       Rectangle r2=r1;
       Rectangle.increment(a);//r1 is not used coz increment is static
       r1.increment(r2);
       System.out.println("a="+a);
       r1.display();
       r2.display();//as display is public it cant be called through
    }
}
class Rectangle
{
    private int length;
    private int breadth;
    Rectangle(int l,int b)
    {
        length=l;
        breadth=b;
    }
    static void increment(int a)
    {
        a++;
    }
    static void increment(Rectangle r1)
    {
        r1.length++;
        r1.breadth++;
    }
    public void display()
    {
        System.out.println("length= "+length);
        System.out.println("breadth= "+breadth);
        
    }
}
