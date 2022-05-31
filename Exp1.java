class Thread1 extends Thread
{
	int value;
	public void run()
	{
		long start = System.nanoTime(); 
		value = (2 * 8);
		System.out.println("Value1 = " + value);
	}
}
class Thread2 extends Thread
{
	int value;
	public void run()
	{
		long start = System.nanoTime();
		value = (4 * 6);
		System.out.println("Value2 = " + value);
	}
}
class Exp1
{
	public static void main(String args[])
	{
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		int ans;
		long start = System.nanoTime();
		t1.start();
		t2.start();
		try
		{
			t1.join();
			t2.join();
		}
		catch(Exception e){}
		ans = t1.value + t2.value;
		long end = System.nanoTime();
		System.out.println("Ans = " + ans);
		System.out.println("Time Complexity = " + (end - start)*Math.pow(10, -9)); 
	}
}
