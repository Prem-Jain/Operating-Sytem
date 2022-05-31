import java.util.Scanner;
class RoundRobin
{
	public static void main(String args[])
	{
		int n, i, qt, count = 0, temp, sq = 0, bt[], wt[], tat[], rembt[];
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter the number of process : "); 
		n = sc.nextInt();
		float awt = 0, atat = 0;
		bt = new int[n];
		wt = new int[n];
		tat = new int[n];
		rembt = new int[n];
		System.out.print("Enter burst time of the process : ");
		for(i = 0; i < n; i++)
		{
			bt[i] = sc.nextInt();
			rembt[i] = bt[i];
		}
		System.out.print("Enter quantum time : ");
		qt = sc.nextInt();
		while(true)
		{
			for(i = 0, count = 0; i < n; i++)
			{
				temp = qt;
				if(rembt[i] == 0)
				{
					count++;
					continue;
				}
				if(rembt[i] > qt)
					rembt[i] -= qt;
				else
				{
					if(rembt[i] >= 0);
					{
						temp = rembt[i];
						rembt[i] = 0;
					}
				}
				sq += temp;
				tat[i] = sq;
			}
			if(n == count)
				break;
		}
		System.out.println("------------------------------------------------------------------------------------");
		System.out.println("\nProcess\tBurst Time\tTurn Around Time\tWaiting Time"); 
		System.out.println("------------------------------------------------------------------------------------");
		for(i = 0; i < n; i++)
		{
			wt[i] = tat[i] - bt[i];
			awt += wt[i];
			atat += tat[i];
			System.out.println((i + 1) +"\t" + bt[i] + "\t\t" + tat[i] + "\t\t" + wt[i]);
		}
		awt /= n;
		atat /= n;
		System.out.println("Average waiting time = " + awt);
		System.out.println("Average Turnaroud time = " + atat);
	}
}    
