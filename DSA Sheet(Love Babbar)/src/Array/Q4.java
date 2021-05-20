package Array;

public class Q4 {

	public static void main(String[] args) 
	{
		int arr[]= {1,2,0,0,2,0,1,2};
		int a[]=sort012(arr);
		for(int i=0;i<a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static int[] sort012(int a[])
    {
        int lo=0;
        int mid=0;
        int hi=a.length-1;
        
        int temp=0;
        
        while(mid<=hi)
        {
            switch(a[mid])
            {
                case 0:{
                    temp=a[mid];
                    a[mid]=a[lo];
                    a[lo]=temp;
                    mid++;
                    lo++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2:
                    {
                        temp=a[mid];
                        a[mid]=a[hi];
                        a[hi]=temp;
                        hi--;
                        break;
                    }
                
            }
        }
        return a;
    
    
    }
}
