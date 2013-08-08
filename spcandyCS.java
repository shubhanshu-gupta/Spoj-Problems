import java.io.*;

class spcandyCS {
	public static void main(String args[]) throws Exception
	{
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	String str = in.readLine();
	int test = Integer.parseInt(str);
	
	for(int i=0; i<test; i++)
	{
	
	String s = in.readLine();
	
	long n = Long.parseLong(s.split(" ")[0]);

	long k =  Long.parseLong(s.split(" ")[1]);
//	double c = Math.pow(2,33)-1;

	if(k==0)
	{
	System.out.println("0 " + n);
	}
	else
	{
		if(n==0 && k==0)
		{
		System.out.println("0 0");
		}
		else
		{
		long teach = n%k;
        	long stu = n/k;

        	System.out.println(stu+" "+teach);

	        }
	}
	}

/*

	if(n>=0&&k<=c)
	{
	
	if(k>0)
	{
	int teach = (int)n%k;
        int stu = (int)n/k;

        System.out.println(stu+" "+teach);
	
	}
	 else
        {

           System.out.println("0 0");
        }

	}
	else
	{

	   System.out.println("0 0");
	}
	}
*/

}
}

