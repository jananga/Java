package demoTwo;

class myRunnableInt implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getId()+" Value : "+i);
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}

public class RunnableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1 = new Thread(new myRunnableInt());
		Thread t2 = new Thread(new myRunnableInt());
		t1.start();
		t2.start();

	}

}
 