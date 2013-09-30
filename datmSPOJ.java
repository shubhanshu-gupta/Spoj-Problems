import java.io.*;

class datmSPOJ {
        public static void main(String args[]) throws IOException
        {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String str = in.readLine();
	
	int test = Integer.parseInt(str);
	
	for(int i=0; i<test; i++)
	{
	String st = in.readLine();

	int n = Integer.parseInt(st.split(" ")[0]);
	int m = Integer.parseInt(st.split(" ")[1]);
		
	int extra = m/500;
	

	int bal = n - m - (extra*10);
	
	if(bal>=0)
	{
	System.out.println(bal);
	}
	else
	{
	System.out.println("Sorry");
	}
/*	
	if(m==0&&n>0)
	{
	System.out.println(n);
	}
	else if(n==0&&m>=0)
	{
	System.out.println("Sorry");
	}
	else if(m>n)
	{
	System.out.println("Sorry");
	}
	else
	{
		if(extra>=1)
		{
		int bal = n-m-(extra*10);
			if(bal>=0)
			{
			System.out.println(bal);
			}
			else
			{
			System.out.println("0");
			}
		}
		else
		{
		int bal1 = n-m;
		System.out.println(bal1);
		}
	}*/
	}
}
}

	
	
