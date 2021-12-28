class arrayDiff
{
	public static void main(String[] args) 
	{
		int[] arr1={1,2,3,4,5};
		int[] arr2={2,3,1,0,5};
		//process for logic
		int len=arr1.length;
		//System.out.println(len);
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				if(arr1[i]==arr2[j])
					break;
				if(arr1[j]==len)
					System.out.println(arr1[i]+" is not available in arr2[]\n");
			}//inner for
		}//outer for	
	}//main(-)
}//class
