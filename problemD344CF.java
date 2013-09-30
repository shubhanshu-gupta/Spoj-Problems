import java.io.*;
import java.util.*;

public class problemD344CF {
	public static void main(String args[]) throws IOException
	{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	String str = in.readLine();

	Stack<Character> c = new Stack<Character>();

	for(int i=0; i<str.length(); i++)
		{
		if(c.empty())
			{
				c.push(str.charAt(i));
			}
		else if(c.peek().equals(str.charAt(i)))
		{
			c.pop();
		}
		else
		{
			c.push(str.charAt(i));
		}
		}
	if(c.empty())
	{
		System.out.println("yes");
	}
	else
	{
		System.out.println("no");
	}
	}
}
