/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fourth;

/**
 *
 * @author anuj
 */
public class InterfaceTest
{
    public static void main(String [] args)
    {
        Circle c=new Circle();
        c.findArea(3);
        float area=c.findArea(3);
        float perimeter=c.findPerimeter(3);
        System.out.println("the area is "+area);
        
        System.out.println("the perimeter is"+perimeter);
        
        
    }
}
interface Area extends Perimeter
{
    float PI=3.14f;
    float findArea(float x);
    float x=10.2f;
    //void display();//yeslai override garnai parcha circle ma
}
interface Perimeter
{
    
    float findPerimeter(float y);
}

class Circle implements Area,Perimeter//perimeter lekhnu pardaina 
{
    public float findArea(float x)
    {
        return PI*x*x;
        
    }
    public float findPerimeter(float x)//if x ko thauma c halema mathi ko x lincha
    {
        return PI*2*x;
    }
}
