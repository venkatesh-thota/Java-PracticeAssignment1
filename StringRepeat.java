import java.util.*;
class StringRepat{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=sc.nextInt();
		int l=s.length();
		String s2="";
		for(int i=l-n;i<l;i++)
		{
			s2+=s.charAt(i);
		}
		System.out.print(s);
		for(int i=0;i<n;i++)
		{
			System.out.print(s2);
		}
	}
}