package interviewPractice;

public class BinarySearch {

	public static void main(String[] args) {
		
		int a[]= {11,12,13,14,15,16,17,18};
		int ele=15;
		int first=0;
		int last=a.length-1;
		int mid;
		
		while(true) {
			mid=(first+last)/2;
			if(ele==a[mid]) {
				System.out.println("Element found at:"+mid);
				break;
			}else if(ele>a[mid]) {
				first=mid+1;
			}else {
				last=mid-1;
			}
		
		if(last<first) {
			System.out.println("Element not found");
			break;
		}
	}

}
}
