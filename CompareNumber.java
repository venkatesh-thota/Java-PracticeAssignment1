import java.util.*;
class CompareNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k= sc.nextInt();
		if(k>20&&k<30)
		{
			if(k%2!=0)
			System.out.println("Tom");
			else
			System.out.println("Jerry");				
		}
	}
}