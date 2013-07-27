import java.io.*;

class chrectCS {
	public static void main(String args[]) throws IOException
	{
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));	

	String str = in.readLine();
	int test = Integer.parseInt(str);
	
	int n,m,k;
	
	for(int i=0; i<test; i++)
	{
	String s = in.readLine();
	n = Integer.parseInt(s.split(" ")[0]);
	m = Integer.parseInt(s.split(" ")[1]);
	k = Integer.parseInt(s.split(" ")[2]);
	
	if(n==1&&m==2 || n==2&&m==1 || n==1&&m==1)
	{
	System.out.println("0");
	}
	else if(n==1||m==1)
	{
	System.out.println(k);
	}
	else if(k%2==0)
	{
	System.out.println(k/2);
	}
	else 
	{
	System.out.println((k+1)/2);
	}

	}
}
}

