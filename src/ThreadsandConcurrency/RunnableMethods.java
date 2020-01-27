package ThreadsandConcurrency;


public class RunnableMethods {
	public static void main(String[] args) {
		A a1 = new A();
		B b1 = new B();
		C c1 = new C();
		
		
		a1.start();
		b1.start();
		c1.start();
		
	}

}

class A extends Thread{
	public void run() {
		for(int i = 0; i<5;i++) {
			{
				System.out.println("From Thread a" + i);
				
			}
		}
		System.out.println("Exit from thread a");
	}
}

class B extends Thread{
	public void run() {
		for(int i = 0;i<5;i++) {
			System.out.println("From Thread b"+i);
		}
		System.out.println("exit from Thread b");
	}
}

class C extends Thread{
	public void run() {
		for(int i =0 ; i<5; i++) {
			System.out.println("From Thread c"+i);
		}
		System.out.println("exit from Thread c");
	}
	
}