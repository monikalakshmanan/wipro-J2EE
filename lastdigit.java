import java.util.Scanner;
import java.lang.Math;
class LastDigit
{
public static void main(String argd[])
{
	int n,l;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	n=Math.abs(n);
	l=n%10;
   System.out.println(l);
}
}
