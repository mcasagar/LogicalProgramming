import java.util.Scanner;
class EvenOdd{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter NO :- ");
		int no=sc.nextInt();
		if(no%2==0)
			System.out.print("\n "+no+" Is even ");
		else
			System.out.print("\n "+no+" Is odd No");
		System.out.println();
	}
}
		

		