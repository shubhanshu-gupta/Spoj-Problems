import java.io.*;
import java.util.*;

	class buy1get1 {
		public static void main(String args[]) throws IOException {

	int t;

//	Scanner in = new Scanner(System.in);
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));	
	
	String str = in.readLine();
	t = Integer.parseInt(str);
	
	for(int i=0; i<t; i++)
        {

	String s = in.readLine();
	
	ArrayList<Character> c = new ArrayList<Character>();

	for(char ch: s.toCharArray()){
		c.add(ch);
				     }

	int k=0;
	int sum=0;
	int pit=0;
		
	while(k<c.size())
	{
	 pit=0;
	for(int u=k+1; u<c.size(); u++)
	{
	 if(c.get(k)==c.get(u))
	{
	c.remove(k);
	c.remove(u-1);
	sum++;
	pit=1;
	break;
	}
	}
	if(pit==0)	
	{
	k++;
	}
	}
	System.out.println(sum+c.size());
	}

	}
        }

	
	
