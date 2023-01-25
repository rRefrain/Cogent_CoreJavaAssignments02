package day06;

/***
 * Driver Class to Run threads and observe behavior
 * 
 * @see MyThreadRunnable
 * @see MyThread
 * 
 * @author michaelmiranda
 */
public class ThreadDemo {
	public static void main(String[] args) {
		MyThreadRunnable r1 = new MyThreadRunnable();
		MyThreadRunnable r2 = new MyThreadRunnable();
		
		Thread ex = new myThread();
		Thread ex2 = new myThread();
		
		Thread ex3 = new Thread(r1);
		Thread ex4 = new Thread(r2);
		
		
		System.out.println("Main thread: " + Thread.currentThread().getName());
		ex.start();
		ex2.start();
		ex3.start();
		ex4.start();
	}
}
