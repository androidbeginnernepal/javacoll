import java.util.Scanner;

public class evenodd 
{
       public static void main(String [] args)
       {
           int a;
           System.out.print("enter");
           Scanner s=new Scanner(System.in);
           a=s.nextInt();
           if(a%2==0)
           {
               System.out.print("the number is even");
              
           }
           else
               System.out.print("the number is odd");
           
       }
}
