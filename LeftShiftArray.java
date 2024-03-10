package interviewPractice;

public class LeftShiftArray {

	
	
	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50,60};
		int temp=a[0];
		
		for(int i=0;i<a.length-1;i++) {
			a[i]=a[i+1];
		}
	a[a.length-1]=temp;
	
	for(int k:a) {
		System.out.print(k + " ");
	}
		
	}

}
