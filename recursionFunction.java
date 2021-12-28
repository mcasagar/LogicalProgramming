class recursionFunction{
	public static void recursiveMethod(int no){
	if(no<=2000){
			System.out.println("Sagar : "+no);
			recursiveMethod(no+1);
		}
	}
	public static void main(String[] args){
		int no=1;
		recursiveMethod(no);
	}
}
		
