import java.util.*;
public class Third{
	
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		int l=a.length();
		int m=l/2;
		for(int i=0;i<l;i++)
		{
			for(int j=0;j<=i;j++)
			{   if(m+j<l)
				System.out.print(a.charAt(m+j));
			    else
				{
					System.out.print(a.charAt(j-(m+1)));
				}
			}
			System.out.println();
		}
	}
}