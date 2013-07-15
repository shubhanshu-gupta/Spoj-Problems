import java.io.*;

class exponent {

	public static double pow(double a,int k)
	{
	if(k==0) return 1;
	if(k==1) return a;
 	
	double j = pow(a,k/2);
//	System.out.println(j);	
	return j*j*pow(a,k%2);
	}

	public static double pow1(double a,int k)
	{
	double ret=1;
/*	
	while(k!=1)
	{
		if(k%2==1)
		{
		 ret*=a;
		//k = k%2;
		}
		else {
		a *= a; 
		k /= 2;
		}
	}
	return ret;*/
	
	for(int j=k; j>0; j--)
	{
	ret = ret*a;
	}
	return ret;

	}

	public static void main(String args[]) throws IOException
	{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	String str = in.readLine();
	
	double n = Double.parseDouble(str.split(" ")[0]);
	int m = Integer.parseInt(str.split(" ")[1]);

	System.out.println(pow1(n,m));
	}
}

	

