package ExceptionHandling;

public class ExceptionHandlingMain {
	public static void main(String[] args) {
		try {
		int a[] = new int[2];
		System.out.println(a[5]);
		}
		catch(Exception e) {
			System.out.println("error occurred");
		}
	}

}
