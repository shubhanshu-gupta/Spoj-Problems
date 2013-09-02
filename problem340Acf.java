import java.io.*;

public class problem340Acf {
	
	public static int gcd(int a, int b)
	{
		if(a==0)
		{
		return b;
		}
		else
		{
		return gcd(b%a,a);
		}
	}
	

	public static void main(String args[]) throws IOException
	{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	String str = in.readLine();
	
	int x = Integer.parseInt(str.split(" ")[0]);
	int y = Integer.parseInt(str.split(" ")[1]);
	int a = Integer.parseInt(str.split(" ")[2]);
	int b = Integer.parseInt(str.split(" ")[3]);
	
	int max,min;
	int g;

	if(x<y)
	{
	g = gcd(x,y);
	}
	else
	{
	g = gcd(y,x);
	}
	
	int l = (x*y)/g;
	int p=0,q=0;

	for(int i=a; i>0; i--)
	{
		if(i%l == 0)
		{
		p = i;
		break;
		}
	}

	for(int i=b; i>0; i--)
	{
		if(i%l == 0)
		{
		q = i;
		break;
		}
	}

	if(p==a)
	{
	System.out.println(((q-p)/l)+1);
	}
	else
	{
	System.out.println((q-p)/l);
	}

	}
}















	
/*	if(x>y)
	{
	max = x;
	min = y;
	}
	else
	{
	max = y;
	min = x;
	}
	

	int lcm=1;

	for(int i=1; i<=min; i++)
	{
	int u = max*i;
 
		if(u%min==0)
		{
		lcm = u;
		break;
		}
	}
//	System.out.println(lcm);

	int cnt=0;
	for(int j=a; j<=b; j++)
	{
		if(j%lcm==0)
		{
		cnt++;
		}
	}
	System.out.println(cnt);
*/
	
