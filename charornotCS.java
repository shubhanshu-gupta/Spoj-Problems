import java.io.*;
import java.util.*;

class charornotCS {
	public static void main(String args[]) throws IOException
	{
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	String str = in.readLine();
	int test = Integer.parseInt(str);
//	int[] arr = new int[test];	
	
	  String s = in.readLine();

	  List<Integer> c = new ArrayList<Integer>(test);


	for(int i=0; i<test; i++)
	{

	c.add(Integer.parseInt(s.split(" ")[i]));

	}

	Collections.shuffle(c);
	
	 Random rand = new Random();
	int pick = rand.nextInt(c.size());
	


        System.out.println(pick);

	 for(int d=0; d<pick; d++)
        {
        System.out.print(c.get(d) + " ");
        }

}
}
