import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a=sc.nextInt();
		if(a%2==0) {
			System.out.println(a+ " is an even number: ");
		}
		else
			System.out.println(a+ " is an odd number: ");
		
	}
	 
}
