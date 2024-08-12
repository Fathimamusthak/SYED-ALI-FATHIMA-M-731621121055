import java.util.Scanner;
public class Prime 
{
    public static void main(String args[])
    {       
        int i, num, a = 0;
        System.out.print("Enter the number :");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        for( i = 2; i < num; i++)
        {
            if(num % i == 0)
            {
                a = 0;
                break;
            }
            else
            {
                a = 1;
            }
         }
         if(a == 1)
         {
             System.out.println(""+num+" is a prime number.");
         }
         else
         {
             System.out.println(""+num+" is not a prime number.");
         }           
    }
}