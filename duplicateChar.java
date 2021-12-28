class duplicateChar 
{
	public static void main(String[] args) 
	{
		String name="sagar";
		char outerCh,innerCh;
		int count=0;

		for(int i=0; i<name.length(); i++)
		{
			for(int j=0; j<name.length(); j++)
			{
				outerCh=name.charAt(i);
				innerCh=name.charAt(j);
				if(i!=j)
				{
					if(outerCh==innerCh)
					{
						char ch=outerCh;
						count++;
						if(count==1)
							System.out.println("Duplicate char is :- "+innerCh);
					}
				}
			}
		}System.out.println("Total duplicate char is : "+count+"\n");
	}
}
