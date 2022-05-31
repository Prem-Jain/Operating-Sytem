class Thread1 extends Thread
{
	public void run()
	{
		for(int i = 1; i <= 5; i++)
		{
			try{ Thread.sleep(2000); }
			catch(InterruptedException e){}
			System.out.println("From Thread 1 : " + i);
		}
		System.out.println("Exit from Thread1\n");
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		for(int i = 1; i <= 5; i++)
		{
			try{ Thread.sleep(2500); }
			catch(InterruptedException e){}
			System.out.println("From Thread 2 : " + i);
		}
		System.out.println("Exit from Thread2\n");
	}
}
class OS
{
	public static void main(String args[])
	{
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t2.start();
		t1.start();
	}
}
