import java.io.*;

class girlsnbsSPOJ {
	public static void main(String args[]) throws IOException
	{
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

//	String str = in.readLine();
	
	while(true)
	{
	 String str = in.readLine();

	double a = Double.parseDouble(str.split(" ")[0]);
	double b = Double.parseDouble(str.split(" ")[1]);
	
	if(a==-1&&b==-1)
	{
	break;
	}
	else
	{

	if(a==0&&b==0)
	{
	System.out.println(0);
	}
	else if(a==b)
	{
	System.out.println("1");
	}
	else if(a>b)
	{
	int j = (int)((a+b)/(b+1));
	System.out.println(j);
	}
	else if(a<b)
	{
//	double x = a/(b+1);
//	double x1 = Math.ceil(x);
	int i = (int)((a+b)/(a+1));	

	System.out.println(i);
	}
	}
	}
}
}
