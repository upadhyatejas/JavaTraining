package ThreadsandConcurrency;

public class RunnableInterfaceExample {
	public static void main (String[] args){
		new NewThread();
		try {
			for(int i = 5;i>0;i--) {
				System.out.println("main thread"+ i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e) {
			System.out.println("excecution interrupted");
		}
	}
	
}


class NewThread implements Runnable{
	Thread t;
	NewThread(){
		t = new Thread(this, "DemoThread");
		System.out.println("Child Thread "+ t);
		t.start();
	}
	public void run(){
		try {
			for(int i = 5;i>0;i--) {
				System.out.println("Child Thread" + i);
				Thread.sleep(500);
			}
		
		}
		catch(InterruptedException e) {
			System.out.println("Child Interrupted");
		}
	}
}