import java.util.*;
import java.io.*;
import java.math.*;

class prime1 {

	public static void main(String args[]) 
	{
/*
	int test,m,n;
	int i,p,u;

	Scanner in = new Scanner(System.in);
	test = in.nextInt();

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	String line,line1;
	line1 = in.readLine();
	test = Integer.parseInt(line1);	

	for(i=0;i<test;i++)
	{
	while((line = in.readLine())!= null && line.length()!=0)
	{
		String[] input = line.split(" ");
		if(input.length == 2)
		{
	m = Integer.parseInt(input[0]);
	n = Integer.parseInt(input[1]);

	for(p=m;p<=n;p++)
	{
	  if(p==1)
	{
	p++;
	}
loop:	  for(u=2;u<=p;u++)
	 {
	if(p%u == 0 && p!=u)
	  {
	continue loop;
	  }
	else
	  {
	System.out.println(p);
	  }
	//	System.out.println(calculateprime(input[0],input[1]));
		}
	}
	}
}
}

*/

	Scanner in = new Scanner(System.in);
        int[] primes = new int[4000];
        int numprimes = 0;
    
        primes[numprimes++] = 2;
        for (int i = 3; i <= 32000; i+=2)
        {
              boolean isprime = true;
               double cap = Math.sqrt(i) + 1.0;
               for (int j = 0; j < numprimes; j++) 
            {
                if (j >= cap) 
                    break;
                   if (i % primes[j] == 0) 
                {
                       isprime = false;
                    break;
                }
            }
            if (isprime) primes[numprimes++] = i;
        }


         int T,N,M;
        T = in.nextInt();
    
        for (int t = 0; t < T; t++) 
        {
            if (t > 0) 
                System.out.println("");

            M = in.nextInt();
            N = in.nextInt();

            if (M < 2) 
                M = 2;

            boolean[] isprime = new boolean[100001];
            for (int j = 0; j < 100001; j++)
            {
                        isprime[j] = true;
            }

            for (int i = 0; i < numprimes; i++) 
            {
                int p = primes[i];
                int start;

                if (p >= M) start = p*2;
                else start = M + ((p - M % p)%p);

                for (int j = start; j <= N; j += p) 
                {
                       isprime[j - M] = false;
                }
            }

            for (int i = M; i <= N; i++) 
            {
                if (isprime[i-M]) System.out.println(i);
             }
        }
    }
}		
