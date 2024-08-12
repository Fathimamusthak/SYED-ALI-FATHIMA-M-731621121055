import java.util.Scanner;
public class CompareObject
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String 1: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the String 2: ");
        String str2 = sc.nextLine();
if (str1.equals(str2)) {
    System.out.println("str1 and str2 are equal");
} else {
    System.out.println("str1 and str2 are not equal");
}
}
}