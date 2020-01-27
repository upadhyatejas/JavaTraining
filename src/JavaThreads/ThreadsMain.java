package JavaThreads;

public class ThreadsMain {
	public static void main(String[] args) {
		Loader object = new Loader();
		Loader object2  = new Loader();
		object.setPriority(9);
		object2.setPriority(10);
		object.start();
		object2.start();
	}

}


class Loader extends Thread{
	public void run() {
		System.out.println("hello");
		System.out.println(Thread.currentThread().getPriority());
	}
}