/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fourth;

/**
 *
 * @author anuj
 */
public class collectionofInheritance 
{
    public static void main(String [] args)
    {
        Results r1=new Results();
        r1.setData(12,27.4f,56.0f);
        r1.display();
    }
}
class Test
{
    int rollNumber;
    float part1,part2;
    void setData(int r,float p1,float p2)
    {
        rollNumber=r;
        part1=p1;
        part2=p2;
    }
    void showData()
    {
        System.out.println("'rooll number: "+rollNumber);
        System.out.println("marks obtained");
        System.out.println("part1= " +part1);
        System.out.println("part2=" +part2);
    }
    }
interface Sports
{
    float sportWt=2.2f;
    void showsportWt();
}
class Results extends Test implements Sports
{
    float total;
    public void showsportWt()
    {
        System.out.println("sport wt="+sportWt);
        
    }
    void display()
    {
        total =part1+part2+sportWt;
        showData();
        showsportWt();
        System.out.println("total scoere = "+total);
        
   }

}