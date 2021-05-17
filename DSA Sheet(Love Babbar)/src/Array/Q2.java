package Array;

public class Q2 {

	public static void main(String[] args) {
		
		int n;
		int arr[]= {10,2,5,3,6,85,61,85};
		
		int max=0,min=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			else if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Maximum :"+max);
		System.out.println("Minimum :"+min);
		
		}

}
