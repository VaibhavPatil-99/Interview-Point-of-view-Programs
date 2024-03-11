package interviewPractice;

public class RemoveElement {

	public static void main(String[] args) {
		
		int a[]= {10,20,50,60,40};
		int ele=50;
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==ele) 
				count++;
		}
		int b[]=new int[a.length-count];
		
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=ele)
			{
				b[index++]=a[i];
			}
		}
		
		for(int k:b) {
			System.out.print(k+ " ");
		}
				}

}
