import java.io.*;

class nstepsSPOJ {
	public static void main(String args[]) throws IOException
	{

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	String str = in.readLine();
	int test = Integer.parseInt(str);

	for(int i=0; i<test; i++)
	{
	String s = in.readLine();
	
	int x = Integer.parseInt(s.split(" ")[0]);
	int y = Integer.parseInt(s.split(" ")[1]);
	
	if(x==y)
	{
		if(x%2==0)
		{
		System.out.println(x+y);
		}
		else
		{
		System.out.println(x+y-1);
		}
	}
	else if(x==y+2)
	{
		 if(x%2==0)
                {
                System.out.println(x+y);
                }
                else
                {
                System.out.println(x+y-1);
                }
	}
	else
	{

		System.out.println("No Number");
	}
	}
}
}
