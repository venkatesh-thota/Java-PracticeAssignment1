import java.util.*;
class AddNum{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s =sc.nextLine();
		StringTokenizer st =new StringTokenizer(s);
		int sum=0;
		while(st.hasMoreElements())
		{
			sum+=Integer.parseInt(st.nextToken());
		}
		System.out.println(sum);
	}
}