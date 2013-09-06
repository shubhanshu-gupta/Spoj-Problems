import java.io.*;
import java.util.*;

class armySPOJ {
	public static void main(String args[]) throws IOException
	{
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
	String str = in.readLine();
	int test = Integer.parseInt(str);
	List<Integer> a1 = new ArrayList<Integer>();
	List<Integer> a2 = new ArrayList<Integer>();

//	String s = in.readLine();


	for(int i=0; i<test; i++)
	{
	String s = in.readLine();
	
	String st = in.readLine();
	int a = Integer.parseInt(st.split(" ")[0]);
	int b = Integer.parseInt(st.split(" ")[1]);


	String s1 = in.readLine();
	
	for(int j=0; j<a; j++)
	{
//	String s1 = in.readLine();
	a1.add(Integer.parseInt(s1.split(" ")[j]));
	}

	
	String s2 = in.readLine();

	for(int j=0; j<b; j++)
        {
  //      String s2 = in.readLine();
        a2.add(Integer.parseInt(s2.split(" ")[j]));
        }
	
	Collections.sort(a1);
	Collections.sort(a2);
/*
		if(Collections.max(a1)>=Collections.max(a2))
		{
		System.out.println("Godzilla");
		}
		else
		{
		System.out.println("MechaGodzilla");
		}*/
	System.out.println(Collections.max(a1)>=Collections.max(a2)?"Godzilla":"MechaGodzilla");

	}

//	String sw = in.readLine();

}
}
