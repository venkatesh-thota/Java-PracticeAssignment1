import java.util.*;
class Alphabet{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		int n=s.length();
		for(int i=0;i<n;i++)
		{
		    int n=(int)s.charAt(i);
		    if(n>97&&n<123)
		    {
		    	char c=s.charAt(i);
		    	if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
		    	{
		    		System.out.println(c+"-"+"vowel,");
		    	}
		    	else
		    		System.out.println(c+"-"+"consonant");
		    }
		    else
		    {
		    	System.out.println("Error");
		    }	
		}
	}
}