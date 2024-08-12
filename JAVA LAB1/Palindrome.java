import java.util.Scanner;
public class Palindrome 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),r,rev=0,dup=n;
while(n!=0){
r=n%10;
rev=rev*10+r;
n=n/10;
}
if(dup == rev)
        System.out.print("Palindrome");
else
     System.out.print("Not a Palindrome");
}
}
