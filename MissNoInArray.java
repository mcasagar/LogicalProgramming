class MissNoInArray 
{
	public static void main(String[] args) 
	{
		int[] arr1={1,2,3,4,5,7,8,9};
		int range=0;
		int len=arr1.length;
		for(int i=0; i<arr1.length; i++)
		{
			range++;
			for(int j=i; j<arr1.length; j++)
			{
				if(arr1[i]==arr1[j])
					break;
				if(arr1[i]==len)
					System.out.println(arr1[i]);
			}

		}
	}
}
