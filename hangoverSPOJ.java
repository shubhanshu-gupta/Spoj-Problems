import java.io.*;

class hangoverSPOJ {
        public static void main(String args[]) throws IOException
        {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
//	String str = in.readLine();
	double d;	
	while(true)
	{

//	String str = in.readLine();
	
	double c = Double.parseDouble(in.readLine());
	
	if(c==0.0)
	{
	break;
	}

	double sum=0;
	int i=2;

	while(true)
	{
	sum+=(1.0/i);
	if(sum>=c) break;
	i++;
	}
	
	System.out.println(i-1 + " card(s)");
	}
}
}
