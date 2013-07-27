import java.io.*;
import java.util.*;

public class problem328aCF {
	public static void main(String args[]) throws IOException
	{
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
//	String st = in.readLine();
	StringTokenizer str = new StringTokenizer(in.readLine());
	int[] a = new int[4];
	
	int i=0;
	while(str.hasMoreTokens())
	{
	a[i] = Integer.parseInt(str.nextToken());
	i++;
	}

	
	 int d = a[1]-a[0];
        if (a[2]==a[1]+d && a[3]==a[2]+d) {
            System.out.println(a[3]+d);
        }
        else {
            if (a[1]*a[1]==a[0]*a[2] && a[2]*a[2]==a[1]*a[3]) {
                if (a[3]*a[1] % a[0]==0)
                    System.out.println(a[3]*a[1]/a[0]);
                else
                    System.out.println(42);
            }
            else
                System.out.println(42);
        }

/*	
	int q = a[1]-a[0];
	int w = a[2]-a[1];
	int e = a[3]-a[2];
	
	int r = a[1]/a[0];
	int t = a[2]/a[1];
	int y = a[3]/a[2];
	int count =0;
	int sol=0;
	if(q==w && w==e && e==q)
	{
	sol = a[3] + (a[3]-a[2]);
	System.out.println(sol);
//	count =1;
	}
	else if(1.0*r==1.0*t && 1.0*t==1.0*y)
	{
	double rr = 1.0*r;

	double five = a[3]*(rr);
	if((int)(five) == sol)
	{
	System.out.println((int)five);
	}
	else
	{
	System.out.println("42");
	}
	}
	else
	{
	System.out.println("42");
	}
	
*/
}
}
