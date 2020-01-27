package StringOperations;
import java.util.Scanner;

public class FibonacciMain {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner myVar = new Scanner(System.in);
		System.out.println("enter the number of boolean digits to be printed \n");
		int numOfDigits = myVar.nextInt();
		FibonacciSeries fib1  = new FibonacciSeries(numOfDigits);
		myVar  = null;
		System.gc();
	}

}
