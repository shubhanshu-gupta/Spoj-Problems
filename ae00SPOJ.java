import java.io.*;

class ae00SPOJ {
	public static void main(String args[]) throws IOException
	{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	String str = in.readLine();
	int n = Integer.parseInt(str);
	int cnt=0;

	for(int i=1; i<=(int)Math.sqrt(n); i++)
	{
	cnt+=((n/i)-i+1);
	}
	


/*	for(int i=1; i<=n; i++)
	{
	for(int j=1; j*j<=i; ++j)
	{
	if(i%j==0)
	{
	++cnt;
	}
	}
	}
*/	
	System.out.println(cnt);
}
}
