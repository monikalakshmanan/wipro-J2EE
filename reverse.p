import java.util.Scanner;
class reverse
{
public static void main (String argf[])
{
	
	int N=0,r,rev=0;
Scanner s=new Scanner(System.in);
N=s.nextInt();
while(N!=0)
{
	r=N%10;
	rev=rev*10+r;
	N=N/10;
}
    System.out.println(rev);
}
}
