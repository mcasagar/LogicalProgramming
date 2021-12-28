class ArraySort 
{
	public static void main(String[] args) 
	{
		int old,nw;
		int[] arr={40,20,50,90,70,30,80};
		old=arr[0];
		nw=arr[1];
		System.out.println("arr={40,20,50,90,70,30,80}");
		//logic for find big no
		for (int i=0; i<arr.length; i++)
		{
			//if(i==arr.length-1)
			//	break;
			//System.out.println(i);
			if(arr[i+1]>arr[i])
				old=arr[i+1];
			else
				old=arr[i];
		}
	}
}
