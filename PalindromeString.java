package interviewPractice;

public class PalindromeString {

	public static void main(String[] args) {
		
		String s="level";
		String rev="";
		
		char c[]=s.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			rev=rev+c[i];
		}
		if(s.equals(rev)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}

	}

}
