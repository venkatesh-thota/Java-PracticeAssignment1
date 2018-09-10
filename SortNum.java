import java.util.*;
class SortNum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n=sc.nextLine();
		int l=n.length();
		int f=0;
		int a[]=new int[l];
			for(int i=0;i<l;i++)
			{
				int k=Character.getNumericValue(n.charAt(i));
				a[i]=k;
			}
			Arrays.sort(a);
			for(int i=0;i<l/2;i++)
			{
				int temp=a[i];
				a[i]=a[l-1-i];
				a[l-1-i]=temp;
			}
			int sum=0;
			System.out.print("Sorted number in non-increasing order : ");
			for(int i=0;i<l;i++)
			{
				System.out.print(a[i]);
				if(a[i]%2==0)
				sum+=a[i];
			}
			System.out.println("Sum of even numbers : "+sum);
			if(sum>15)
			System.out.println(true);
			else
			System.out.println(false);	

		}
	}
