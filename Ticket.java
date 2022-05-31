class MyThread extends Thread
{
	String task;
	MyThread(String task)
	{
		this.task = task;
	}
	public void run()
	{

		for(int i = 1; i <= 5; i++)
		{
			System.out.println(task+ " : " +i);
			try
			{
				Thread.sleep(1000); 
			}
			catch(InterruptedException ie) {}
			
		}
	} 
	public static void main(String[] args)
	{
		MyThread th1 = new MyThread("Cut the ticket"); 
		MyThread th2 = new MyThread("Show your seat number");
		Thread t1 = new Thread(th1);
		Thread t2 = new Thread(th2);
		t1.start();
		t2.start();
	}
}
