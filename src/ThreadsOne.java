
class MyClass extends Thread{

	@Override
	public void run() {
		for(int i =0; i<10; i++)
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

public class ThreadsOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyClass mc = new MyClass();
		mc.start();
		MyClass mc2 = new MyClass();
		mc2.start();
		
	}

}
