package interviewPractice;

public class RevArray {

	public static void main(String[] args) {
	
	int a[]= {10,20,30,40,50,60};
	
//	for(int i=a.length-1;i>=0;i--) {
//		System.out.print(a[i]+ " ");
//		
		
	//}
	
	int i=0;
	int j=a.length-1;
	int temp;
	
	while(i<j)
	{
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		i++;
		j--;
		
	}
	for(int k:a)
	{
		System.out.print(k+" ");
	}
	
	}
}
