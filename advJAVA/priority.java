import java.util.*;

class priority
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int i;
		int n,j,temp;
		
		int bt[]=new int [n];
		int wt[]=new int [n];
		int pri[]=new int [n];
		int tat[]=new int [n];
		int pos;
		float awt=0,atat=0;
		
		System.out.println("Enter the processes");
		n=sc.nextInt();
		
		System.out.println("Enter the Burst time");
		for(i=0;i<n;i++)
		{
			bt[i]=sc.nextInt();
		}
		
		System.out.println("Enter the Priority");
		for(i=0;i<n;i++)
		{
			pri[i]=sc.nextInt();
		}
		
		for(i=0;i<n;i++)
		{
			pos=i;
			for(j=i+1;j<n;j++)
			{
				if(pri[j]<pri[pos])
				{
					pos=j;
				}
			}
			temp=pri[i];
			pri[i]=pri[pos];
			pri[pos]=temp;
			
			temp=bt[i];
			bt[i]=bt[pos];
			bt[pos]=temp;
		}
		wt[0]=0;
		System.out.println("Process\tBurst time\tPriority\tWaiting time\tTurn Around Time\n");
		for(i=0;i<n;i++)
		{
			wt[i]=0;
			tat[i]=0;
			
			for(j=0;j<n;j++)
			{
				wt[i]=wt[i]+bt[j];
			}
			tat[i]=wt[i]+bt[i];
			
			awt=awt+wt[i];
			atat=atat+tat[i];
			
			System.out.println(i+1+bt[i]+pri[i]+wt[i]+tat[i]);
		}
		awt=awt/n;
		atat=atat/n;
		
		System.out.println("Avg. waiting time"+awt);
		System.out.println("Avg. turn time"+atat);
	}
}