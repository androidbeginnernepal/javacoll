/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anuj
 */
import packageRadha.*;
public class method
{
   
            static void f1()
            {
                System.out.println("this is f1() method");
                
            }
            
            static int f1(int n)
            {
                int i,s=0;
                for(i=1;i<=n;i++)
                    s+=i;
                return s;
                    
            }
            static String f1(String s1,String s2)
            {
                return s1+" "+s2;
            }
            public static void main(String[] args)
            {
                test1 objT=new test1();
                objT.display();
                System.out.println("calling f1");
                f1();
                int s=f1(5);
                System.out.println("the sum is"+s);
                System.out.println("full name is "+f1("abc","xyz"));
               
            }
}


