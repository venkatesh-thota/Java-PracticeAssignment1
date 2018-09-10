import java.util.*;
class Iteration{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{	int k=i;
			while(k!=0)
			 {System.out.print(i+" ");
				k--;
				}
		}
		System.out.println();
	}
}