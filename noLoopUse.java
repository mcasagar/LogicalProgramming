class noLoopUse
{
	public static void namePrinter(int count)
	{
		int max=2000;
		if(count<=2000)
		{
			System.out.println("Sagar "+count);
			count++;
			namePrinter(count);
		}
	}
	public static void main(String[] args)
	{
		int count=0;
		namePrinter(count);
	}
	
}
