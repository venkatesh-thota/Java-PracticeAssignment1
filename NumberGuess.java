import java.util.*;
class NumberGuess{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rand = new Random(); 
        int rand_int1 = rand.nextInt(50); 
		int target=rand_int1;
		int search=sc.nextInt();;
		while(search!=target)
		{
			if(search>target)
			{
				System.out.println("Number guessed is more than original number ");
				search=sc.nextInt();
			}
			else if(search<target)
			{
				System.out.println("Number guessed is less than original number ");
				search=sc.nextInt();
			}
		}
			if(search==target)
			{
				System.out.println("Number guessed matches the original number");
			}
	}
}