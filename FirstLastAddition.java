class FirstLastAddition 
{
	public static void main(String[] args) 
	{
		int no=123456,add=0,count=0,rev=0;
		while(no!=0)
		{
			count++;	
			rev=no%10;
			if(count==1)
				add=rev;
			no=no/10;
		}
		add=add+rev;
		System.out.println(add);
	}
}
