import java.io.*;
import java.util.*;

public class problem344Bcf {
	public static void main(String args[])
	{
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	int[] x = new int[8];
	int[] y = new int[8];	

	for(int i=0; i<8; i++)
	{
	String s = in.readLine();
	x[i] = Integer.parseInt(s.split(" ")[0]);
	y[i] = Integer.parseInt(s.split(" ")[1]);
	}
	
