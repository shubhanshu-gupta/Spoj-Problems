import java.io.*;
//import java.util.*;

class ap2SPOJ {
        public static void main(String args[]) throws IOException
        {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String str = in.readLine();
        int test = Integer.parseInt(str);

	for(int i=0; i<test; i++)
	{
	String st = in.readLine();
	
//	int n;
	long n,d,a;	

	long a3 = Long.parseLong(st.split(" ")[0]);
	long b = Long.parseLong(st.split(" ")[1]);
	long c = Long.parseLong(st.split(" ")[2]);

//	a = a3-2*d;
	 
//	(n-5)*d = b-a3;

	n = (2*c)/(a3+b);
	
	d = (b-a3)/(n-5);
	
	a = a3-2*d;

	System.out.println(n);
	
	long ap=0;
	
	for(int j=0; j<n; j++)
	{
	ap = a + j*d;
	System.out.print(ap+" ");
	}
	System.out.println();
	}
}
}
