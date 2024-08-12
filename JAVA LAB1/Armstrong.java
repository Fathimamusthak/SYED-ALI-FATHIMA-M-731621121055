import java.util.*;
class Armstrong{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.print("Enter a Number:");
int n=s.nextInt();
int orgnum,rem,res=0;
orgnum=n;
while(orgnum!=0)
{
rem=orgnum%10;
res+=Math.pow(rem,3);
orgnum/=10;
}
if(res==n)
System.out.println(" Armstrong Number");
else
System.out.println("Not an Armstrong Number");
}
}