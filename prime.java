import packageRadha .test1;
import java.util.Scanner;
public class prime
{
    
    public static void main(String[] args)
    {
        int i,n,sum=0;
        System.out.print("enter the num");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                sum++;
            }   
                //System.out.println(i);
           
        }
         System.out.println(sum );
         if(sum==2)
         {
             System.out.println("it is a prime prime number");
             
         }
         else 
             System.out.println("it is not a prime number");
         
             
    }
    
}
