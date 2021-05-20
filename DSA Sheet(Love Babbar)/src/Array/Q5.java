package Array;

public class Q5 {

	public static void main(String[] args) 
	{
		int arr[]= {18,-2,8,-10,-2,50,1,-2};
		int a[]=sort(arr);
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static int[] sort(int a[])
    {
        int lo=0;
        int hi=a.length-1;
        int temp=0;
        while(lo<=hi)
        {
        	if(a[lo]<0 && a[hi]<0)
        		lo++;
        	else if(a[lo]>=0 && a[hi]<0)
        	{
        		temp=a[hi];
        		a[hi]=a[lo];
        		a[lo]=temp;
        		lo++;
        		hi--;
        	}
        	else if(a[lo]>=0 && a[hi]>=0)
        		hi--;
        	else
        	{
        		lo++;
        		hi--;
        	}
        }
        
        return a;
    
    
    }
}
