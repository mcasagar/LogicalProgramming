class ReverceCharArray2
{
	public static void main(String[] args) 
	{
		String name="Sagar";
		int count=0,len=name.length();

		char[] ch=new char[len+1];
		System.out.print("[");
		for(int i=name.length(); i>0; i--)
		{
			count++;
			ch[count]=name.charAt(i-1);
			System.out.print(ch[count]);
			if(i>1)
				System.out.print(",");
		}
		System.out.print("]\n");
	}
}
