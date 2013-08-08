import java.io.*;

class coinchngCS {
	public static void main(String args[]) throws Exception
	{
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	String s = in.readLine();
	
	int test = Integer.parseInt(s);
	
	for(int i=0; i<test; i++)
	{
	
	String str = in.readLine();
	
	int c = Integer.parseInt(str.split(" ")[0]);
	int as = Integer.parseInt(str.split(" ")[1]);
	int k = Integer.parseInt(str.split(" ")[2]);
	
	switch(as)
	{
	case 1: 
	
//	int a = 1;
//	int r = c;
	int out=1;
	for(int j=1; j<k; j++)
	{out *= c;}
	
	System.out.println(out);

	break;
	
	case 2: 
	

	int d=c;
	int out1 =0;
	for(int j=0; j<k; j++)
	{
	out1 += d;
	}
	if(out1%5==0)
	{
	out1+=d;
	}
	System.out.println(out1);
	
	break;

	case 3:
	
	int d1 = as;
	int[] arr = new int[k];
	arr[0] = as;
	for(int j=1; j<k; j++)
	{
	arr[j]= 	

	int d1=c;
        int out2 =0;
        for(int j=0; j<k; j++)
        {
        out2 += d1;
        }
        if(out2%5==0)
        {
        out2+=d1;
        }
        System.out.println(out2);

        break;

	case 4:
	
	int d2=c;
        int out3 =0;
        for(int j=0; j<k; j++)
        {
        out3 += d2;
        }
        if(out3%5==0)
        {
        out3+=d2;
        }
        System.out.println(out3);

        break;

	}
}
}
}
