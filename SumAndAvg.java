package interviewPractice;

public class SumAndAvg {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8};
		float sum=0;
		float avg=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			avg=sum/a.length;
		}
		System.out.println(sum);
		System.out.println(avg);
		
	}

}
