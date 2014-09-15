
import java.util.Scanner;

public class factorial
{
    public static void main(String[] args)
    {
        int i,n,f=1;
        System.out.print("enter the num: ");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
            f*=i;
                //System.out.println(i);
           
        }
         System.out.println(f);
                  
             
    }
}
