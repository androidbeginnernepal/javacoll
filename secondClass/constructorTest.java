/*esma constructor ko use garna sikayeko cha.
 * class banaune and main ma call garne but object through.
 * euta clas ko object jati pani banauna sakincha
 * 
*/
package secondClass;//yo package ma class contructorTest and Rectangle include cha


public class constructorTest//jaileni yo class and save gareko same hunuparcha

{
    public static void main(String [] args)//String ma dhyan dine
    {
        Rectangle r1=new Rectangle();//rectangle class ko main ma object banako
        r1.length=5;//object r1 le member lenth of rect lai asign gareko/
        r1.breadth=8;
        System.out.println("Area of R1: "+r1.getArea());//getarea call through object/
        System.out.println("perimeter of R1 "+r1.getPerimeter());
        Rectangle r2=new Rectangle(1,12);//param ko object banako jun mathi 3 step lagthyo.
        System.out.println("area of r2 is "+r2.getArea());//second obj le call gareko
        System.out.println("perimeter of r2 "+r2.getPerimeter());
        
    }
}
class Rectangle 

{
    int length;
    int breadth;
    public Rectangle(){};//default constructor
    
    public Rectangle(int length,int breadth)//parameterized constructor use gareko
            
    {
       this.length=length;//this le class ko variable n constructor ko same bhayema class lai dekhaucha
       this.breadth=breadth;
        
    }
    public int getArea()//return type haru lai public int huncha/
    {
        return length*breadth;
       
    } 
    public int getPerimeter()
    {
        return 2*(length+breadth);
    }
}
  

