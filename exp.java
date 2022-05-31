import java.util.*;
class Thread1 extends Thread
{
	long time;
	public void run()
	{
		long start = System.nanoTime();
		int ans = (2 * 4) + (6 * 8);
		System.out.println("Ans = : " + ans);
		long end = System.nanoTime();
		time = end - start;
	}
}
class exp
{
	public static void main(String arg[])
	{
		Thread1 t = new Thread1();
		t.start();
		try{t.join();}catch(Exception e){}
		System.out.println("Time Complexity = " + t.time*Math.pow(10, -9));
	}
}
