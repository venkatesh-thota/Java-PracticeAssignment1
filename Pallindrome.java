import java.util.*;
class pallindrome{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n=sc.nextLine();
		int l=n.length();
		int f=0;
		for(int i=0;i<l/2;i++)
		{
			if(n.charAt(i)!=n.charAt(l-1-i))
			{
				f=-1;
				System.out.println(n+" not a pallindrome");
				break;
			}
		}
		if(f!=-1)
		{   int sum=0;
			for(int i=0;i<l;i++)
			{
				int k=Character.getNumericValue(n.charAt(i));
				if(k%2==0)
				{
					sum+=k;
				}
			}

			if(sum>25)
			System.out.println(n+" is a pallindrome and sum of even numbers is greater than 25");
			else
			System.out.println(n+" is a pallindrome and sum of even numbers is less than 25");	

		}
	}
}