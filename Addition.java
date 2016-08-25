import java.util.Scanner;


public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Add = 0;
		int sub = 0;
		int mul = 0;
		int div = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int numOne = scan.nextInt();
		System.out.println("Enter 2nd number");
		int numTwo = scan.nextInt();
		Add = numOne + numTwo;
		System.out.println("The Addition of two numbers is " +Add);
		sub = numOne - numTwo;
		System.out.println("The Addition of two numbers is " +sub);
		mul = numOne * numTwo;
		System.out.println("The Addition of two numbers is " +mul);
		div = numOne / numTwo;
		System.out.println("The Addition of two numbers is " +div);

	}

}
