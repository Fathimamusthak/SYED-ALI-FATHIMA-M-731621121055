import java.util.*;
class Factorial{
public static void main (String args[]){
Scanner s=new Scanner(System.in);
System.out.print("Enter a Number:");
int n=s.nextInt();
int i,fact=1;
for(i=1;i<=n;i++){
fact=fact*i;
}
System.out.println("Factorial:"+fact);
}
}
