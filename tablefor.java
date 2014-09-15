import java.util.Scanner;
public class tablefor 
{
    public static void main(String[] args)
    {
        int i,j,n;
        Scanner s=new Scanner(System.in);
        System.out.print("table for");
        n=s.nextInt();
        
        
        for(i=1;i<=10;i++)
        {
              
            {
                System.out.println(n+"*"+i+"="+n*i);
            
            }
        }
    }
}
