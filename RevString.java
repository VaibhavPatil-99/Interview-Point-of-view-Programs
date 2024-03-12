package interviewPractice;

public class RevString {

	static String s="patil";
	public static void main(String[] args) {
//		char c[]=s.toCharArray();
//		for(int i=c.length-1;i>=0;i--) {
//			System.out.print(c[i]);
			//}
		
		char ca[]=s.toCharArray();
		int i=0;
		int j=ca.length-1;
		
	while(i<j)
	{
		char temp=ca[i];
		ca[i]=ca[j];
		ca[j]=temp;
		i++;
		j--;
		
	}
	for(char k:ca)
	{
		System.out.print(k);
	}

	
	}
	
}