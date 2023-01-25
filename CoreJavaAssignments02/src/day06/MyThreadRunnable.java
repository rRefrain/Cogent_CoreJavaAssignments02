package day06;


/**
 * Class to implement and test Runnable
 * 
 * @see Runnable
 * @author michaelmiranda
 */
public class MyThreadRunnable implements Runnable {

	static int f = 0;
	
	@Override
	public void run() {
		int v = f;
		f += 10;
		for(int i = v; i < v + 10; i++) {
			System.out.println("Why Thread#" + 
					Thread.currentThread().getName() + "\t" + + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
	}

}
