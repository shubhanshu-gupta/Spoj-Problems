import java.io.*;

public class problemA322{
	public static void main(String args[]) throws IOException
	{
//	int n,m;
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	String str = in.readLine();
	int n = Integer.parseInt(str.split(" ")[0]);
	int m = Integer.parseInt(str.split(" ")[1]);

	int ans = n+m-1;
	System.out.println(ans);
	
	for(int i=1; i<=n; i++)
	{
	System.out.println(i+" "+1);
	}
	
	for(int j=2; j<=m; j++)
	{
	System.out.println(1+" "+j);
	}
}
}
