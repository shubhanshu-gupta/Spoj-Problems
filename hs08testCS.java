import java.io.*;
import java.util.*;

class hs08testCS {
	public static void main(String args[]) throws IOException
	{

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	

	String str = in.readLine();
	
	StringTokenizer st = new StringTokenizer(str);
	
	double fee = 0.5;
	double deposit = Double.parseDouble(st.nextToken());
	double avlbalance = Double.parseDouble(st.nextToken());
	double newbalance = avlbalance-deposit-fee;

	if(deposit%5!=0 || newbalance<0)
	{
	System.out.println(avlbalance);
	}
	else
	{
	System.out.println(newbalance);
	}

}
}
