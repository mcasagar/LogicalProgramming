import java.util.Scanner;

class ArrayExample 
{
	public static void main(String[] args) 
	{
		System.out.print("How many values do you want to store :- ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[] ai=new int[num];
		System.out.println("\nTotal " +num+" values will be stores in array");
		
		//storing values
		System.out.println("Storing values in array");
		for(int i=0; i<num; i++)
		{
			System.out.print("Enter the "+(i+1)+" value:- ");
			ai[i]=sc.nextInt();
		}
		display(ai);

	}
	
	static void display(int[] ai)
	{	
		System.out.println("Print all values");
		for(int i=0; i<ai.length; i++)
		{
			System.out.println("The First value of array is :- "+ai[i]);
		}
	}
}
