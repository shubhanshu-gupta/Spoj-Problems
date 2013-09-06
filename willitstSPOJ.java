import java.io.*;
	
class willitstSPOJ {
	public static void main(String args[]) throws IOException
	{
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	

//	while(true)
//	{

	String str = in.readLine();
	
//	if(str == null)
//	{
//	break;
//	}
//	else
//	{
	long n = Long.parseLong(str);
	long flg = 0;

	while(n!=1)
	{
		if(n%2 == 0)
		{
		n = n/2;
		}
		else
		{
		flg = 1;
		System.out.println("NIE");
		break;
		}

	}

	if(flg == 0)
	{
	System.out.println("TAK");
	}

	
}
}
