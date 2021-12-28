class UseOfFinally{
	public static void main(String[] args){
		int tableNo=2;
		table(tableNo);
	}
	public static void table(int tableNo){
		int count=1;
		if(count<11){
			System.out.println(tableNo);
			count=count+1;
			tableNo=tableNo+(2*count);
			table(tableNo);
		}
	}
}