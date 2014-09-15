/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdcalss;

/**
 *
 * @author anuj
 */
class SingleInheritance
{
    public static void main(String[] args)
    {
        BedRoom br = new BedRoom();
        br.setData(5,3,4);
        Room r=br;// implicit type casting
        BedRoom br1=(BedRoom) r;//explicit //down casting
        System.out.println("height="+br1.height);
        System.out.println("Area="  +br.area());
        System.out.println("Volume=" +br.volume());
    }
}   
public class Room 
{
    int length;
    int breadth;
    int area()
    {
        return length*breadth;
    }
    
}
class BedRoom extends Room
{
    int height;
    void setData(int x,int y,int z)
    {
          length=x;
          breadth=y;
          height=z;
    }
    int volume()
    {
        return length*breadth*height;
    }
}

          
    


