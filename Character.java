import java.util.*;
class Character{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c=sc.nextLine.charAt(0);
		if(((int)c>=65)&&((int)c<=90))
			System.out.println("capital letter");
		else if(((int)c>=97)&&((int)c<=122)) 
			System.out.println("Lower case letter");
		else if(((int)c>=48)&&((int)c<=57))
			System.out.println("digit");
		else
			System.out.println("special symbol");	  
	}
}