package ThreadsandConcurrency;

public class ThreadBasics {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("Current Thread: "+ t);
		t.setName("myThread");
		System.out.println(" name changed :"+t);
		try {
			for(int n = 5; n>0 ; n-- ) {
				System.out.println(n);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e){
			System.out.println("Main thread Interupted");
			
		}
	
	}
	
}

