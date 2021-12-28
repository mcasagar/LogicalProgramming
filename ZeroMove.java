class ZeroMove 
{
	public static void main(String[] args) 
	{
		int[] a={0,0,0,5,0,6,4,0,8};
		int temp=0;
		for(int i=0; i<a.length; i++)
		{  
			if(a[i]!=0)
				a[temp++]=a[i];
		}

		while(temp<a.length)
			a[temp++]=0;

		for(int i=0; i<a.length; i++)
			System.out.println(" "+a[i]);
	}
}
