import java.io.*;

class poj1799 {
	public static void main(String args[]) throws IOException
	{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String str = in.readLine();
	int test = Integer.parseInt(str);
	
	
	for(int i=0;i<test;i++)
	{
	String str1 = in.readLine();
	double R = Double.parseDouble(str1.split(" ")[0]);
	int n = Integer.parseInt(str1.split(" ")[1]);

	double a = 180/n;
	double radians = Math.toRadians(a);
	
	double r = (R*Math.sin(radians))/(Math.sin(radians) + 1);
	
	System.out.println("Scenario #"+(i+1));
	System.out.println(r);
	System.out.println();
	}
}
}
