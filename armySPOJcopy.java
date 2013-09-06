////// armySPOJ.java is a compltely correct solution and code....it's just that I'm not getting how to reduce the time or how to optimize the code even more....that's why 
///// this code.....


import java.util.*;
import java.io.*;

class armySPOJcopy {
	public static void main(String args[]) throws IOException
	{
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for(int c = 0, C = Integer.parseInt(in.readLine().trim()); c++ < C;){
			in.readLine();
			in.readLine();
			int maxG = 0, maxM = 0;
		
			for(StringTokenizer st = new StringTokenizer(in.readLine()); st.hasMoreTokens(); ) 
			{
			maxG = Math.max(maxG, Integer.parseInt(st.nextToken()));
			}

			for(StringTokenizer st = new StringTokenizer(in.readLine()); st.hasMoreTokens(); ) 
			{
			maxM = Math.max(maxM, Integer.parseInt(st.nextToken()));
			}

			System.out.println(maxG>=maxM?"Godzilla":"MechaGodzilla");
		}
	}
}
