import java.util.Scanner;

public class SwapWithoutVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a=sc.nextInt();
		System.out.println("Enter the second number: ");
		int b=sc.nextInt();
		a=a+b; 
		b=a-b; 
		a=a-b;
		System.out.println("After swapping");
		System.out.println("First number: "+a);
		System.out.println("Second number: "+b);
	}

}
