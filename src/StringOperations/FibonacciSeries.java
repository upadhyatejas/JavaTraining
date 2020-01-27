package StringOperations;

public class FibonacciSeries {
	FibonacciSeries(int numOfDigits){
		int firstDigit = 0;
		int secondDigit = 1;
		int thirdDigit;
		
		System.out.println(firstDigit+" "+secondDigit);
		
		for(int i = 2; i <numOfDigits;++i) {
			thirdDigit = secondDigit + firstDigit;
			System.out.println(" "+thirdDigit);
			firstDigit = secondDigit;
			secondDigit = thirdDigit;
		}
		
		
	}

}
