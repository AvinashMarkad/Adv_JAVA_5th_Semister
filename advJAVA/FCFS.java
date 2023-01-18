import java.util.*;
 
public class Priority_1 
{
 public static void main(String prgs[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter no of process: ");
  int n = sc.nextInt();
  int pid[] = new int[n];   
  int pr[] = new int[n];   
  int bt[] = new int[n];  
  int ct[] = new int[n];   
  int ta[] = new int[n];  
  int wt[] = new int[n];  
  int temp;
  float avgwt=0,avgta=0;
 
  for(int i = 0; i < n; i++)
  {
   System.out.println("enter process " + (i+1) + " apriority: ");
   pr[i] = sc.nextInt();
   System.out.println("enter process " + (i+1) + " brust time: ");
   bt[i] = sc.nextInt();
   pid[i] = i+1;
   }
  
   //sorting according to prrival times
   for(int i = 0 ; i <n; i++)
   {
    for(int  j=0;  j < n-(i+1) ; j++)
     {
      if( pr[j] > pr[j+1] )
       {
        temp = pr[j];
        pr[j] = pr[j+1];
        pr[j+1] = temp;
		
        temp = bt[j];
        bt[j] = bt[j+1];
        bt[j+1] = temp;
		
        temp = pid[j];
        pid[j] = pid[j+1];
        pid[j+1] = temp;
       }
     }
   }
   // finding completion times
    for(int  i = 0 ; i < n; i++)
     {
      if( i == 0)
       {
        ct[i] = pr[i] + bt[i];
       }
      else
         {
           if( pr[i] > ct[i-1])
            {
              ct[i] = pr[i] + bt[i];
            }
             else
                ct[i] = ct[i-1] + bt[i];
              }
               ta[i] = ct[i] - pr[i] ;          
               wt[i] = ta[i] - bt[i] ;          
               avgwt += wt[i] ;               
               avgta += ta[i] ;            
               }
            System.out.println("\npid  priority  brust  complete turn waiting");
            for(int  i = 0 ; i< n;  i++)
               {
                 System.out.println(pid[i] + "  \t " + pr[i] + "\t" + bt[i] + "\t" + ct[i] + "\t" + ta[i] + "\t"  + wt[i] ) ;
                }
              sc.close();
              System.out.println("\naverage waiting time: "+ (avgwt/n));    
               System.out.println("average turnpround time:"+(avgta/n));    
       }
 }