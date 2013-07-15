import java.util.*;
import java.io.*;

class holesCS {
	public static void main(String args[]) throws IOException {
	
		
		String names;
			
//		ArrayList<Character> c = new ArrayList<Character>();
          
//	        Scanner in = new Scanner(System.in);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 
		String t = in.readLine();
		int test = Integer.parseInt(t);
 
	//	names = new String[test];
		
	//	int count=0;
		
		for(int i=0; i<test; i++)
		{
		 names = in.readLine();
		
		ArrayList<Character> c = new ArrayList<Character>();

		for(char ch: names.toCharArray()){
                c.add(ch);
                                     }
 		
		int len = names.length();
		int count=0;	
		for(int j=0; j<len; j++)
		{
		if(c.get(j)=='A' || c.get(j)=='D' || c.get(j)=='Q' || c.get(j)=='P' || c.get(j)=='O' || c.get(j)=='R')
		{
		count++;
		}
		else if(c.get(j)=='B')
		{
		count+=2;
		}
		}
		System.out.println(count);
		}
}
}
	
