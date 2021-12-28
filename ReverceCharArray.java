class ReverceCharArray 
{
	public static void main(String[] args) 
	{
		String name="Sagar";
		int count=0,len=name.length();

		char[] ch=new char[len+1];
		for(int i=name.length(); i>0; i--)
		{
			count++;
			ch[count]=name.charAt(i-1);
			System.out.println(ch[count]);
		}
	}
}
