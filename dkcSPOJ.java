import java.io.*;

class dkcSPOJ {
	public static void main(String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String str = in.readLine();
		int test = Integer.parseInt(str);
		
		for(int i=0; i<test; i++)
		{

		int n = Integer.parseInt(in.readLine());  // no. of customers
		
		String st = in.readLine();
		
		int[] k = new int[n];	
		
		int cnt=0;
		int c1=0,c2=0;
		for(int j=0; j<n; j++)
		{
		k[j] = Integer.parseInt(st.split(" ")[j]);
		
	
		int r=0;
/*
		if(k[j]%5>=3 || k[j]%5==0)
		{c1++;}
		else if(k[j]%5==1 || k[j]%5==2)
		{	c2++;}

		}
		if(c1>=c2)
		{
			System.out.println("PROFIT");
		}
		else
			System.out.println("BAD SYSTEM");
		
		
		}
	}
}
*/

		if(k[j]%5 == 0)
		{
			r = k[j];
		}
		else if(k[j]%5 < 2.5)
		{
			r = k[j] - k[j]%5;
		}
		else
		{
			r = k[j] + (5 - k[j]%5);
		}
		
		int diff = r-k[j];

		if(diff>=0)
{			c1+=diff;
	//		System.out.println(c1);
}
		else
		{	
			c2+=diff;
	//		System.out.println(c2);
		}
	}

		if(c1+c2>=0)
			System.out.println("PROFIT");
		else
			System.out.println("BAD SYSTEM");


//		System.out.println(r);

		}
	}
}

