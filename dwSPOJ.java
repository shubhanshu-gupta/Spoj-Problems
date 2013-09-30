import java.io.*;

class dwSPOJ {
        public static void main(String args[]) throws IOException
        {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String str = in.readLine();

//	long n = Long.parseLong(str);
	
	long l = str.length();
//	System.out.println(l);

	int count=0,i=0;
	int p;

	for(p=0; p<l; p++)
	{
		if(str.charAt(p)=='1')
		  count+=2;
		
		if(str.charAt(p)=='0' && count>0)
		  count-=1;
	}

	System.out.println(count);

/*
	
	if(str.charAt(0)=='0')
	{
		while(str.charAt(i)!='1')
		{
		count=0;
		i++;
		}
	for(int j=i; j<l; j++)
	{
	if(str.charAt(j)=='1')
	{
	count+=2;
	}
	else if(str.charAt(j)=='0')
	{
	count-=1;
	}
	}
	}
	
	else if(str.charAt(0)=='1')
	{
	
	for(int k=0; k<l; k++)
	{
	if(str.charAt(k)=='1')	
	{
	count+=2;
	}
	else if(str.charAt(k)=='0')
	{
	count=count-1;
	}
	}
	}
	
	if(count<1)
	{
	System.out.println(0);
	}
	else
	{	
	System.out.println(count);
	}
*/
}
}
