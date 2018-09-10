import java.util.*;
class StringReverse{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		int n=s.length();
		String s2="";
		for(int i=n-1;i>=0;i--)
		{
			s2+=s.charAt(i);
		}
		System.out.println(s2);
	}
}