import java.util.Scanner;

public class comparegreater 
{
    public static void main(String [] args)
       {
           int a,b;
           System.out.print("enter first ");
           Scanner s=new Scanner(System.in);
           a=s.nextInt();
           System.out.print("enter the next ");
           b=s.nextInt();
           if(a>b)
            System.out.print(+a+ " is greater than " +b);
           else
            System.out.print(+b+" is greater than "+a);
       }
}
