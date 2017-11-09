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
					System.out.println("priority : "+Thread.currentThread().getPriority()+" Name : "+Thread.currentThread().getName());
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
					System.out.println("priority : "+Thread.currentThread().getPriority()+" Name : "+Thread.currentThread().getName());
		
				}
				
			}
		});
		
		
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.setName("MyNamedThread");
		t1.start();
		
		//t1.join();
		t1.yield();
		t2.start();
		//t2.join();
		t2.yield();
		//asfea
		
		System.out.println("Count : "+count);
	}

}
