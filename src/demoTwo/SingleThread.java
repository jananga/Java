package demoTwo;

public class SingleThread {
	private static int count=0;

	private synchronized static void incVar()
	{
		count++;
	}
	public SingleThread() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<1000;i++)
				{
					incVar();
					System.out.println("First loop Count : "+count);
				}
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<2000;i++)
				{
					incVar();
					System.out.println("Second loop Count : "+count);

				}
				
			}
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Count : "+count);
	}

}
