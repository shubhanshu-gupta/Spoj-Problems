import java.io.*;

public class problem366Acf{
	public static void main(String args[]) throws IOException
	{
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	String str = in.readLine();
	int x = Integer.parseInt(str.split(" ")[0]);
	int y = Integer.parseInt(str.split(" ")[1]);
	
	if(x>0 && y>0)
	{
	int sum = x+y;
	System.out.println("0 "+ sum+ " "+sum+" 0");
	}
	else if(x<0 && y>0)
	{
	int sum = (-1)*x + y;
	int x1 = (-1)*sum;
	int y1 = 0;
	int x2 = 0;
	int y2 = sum;
	System.out.println(x1+" "+y1+" "+x2+" "+y2);
	}
	else if(x<0 && y<0)
        {
        int sum = (-1)*x + (-1)*y;
        int x1 = (-1)*sum;
        int y1 = 0;
        int x2 = 0;
        int y2 = (-1)*sum;
        System.out.println(x1+" "+y1+" "+x2+" "+y2);
        }
	else if(x>0 && y<0)
        {
        int sum = x + (-1)*y;
        int x1 = sum;
        int y1 = 0;
        int x2 = 0;
        int y2 = (-1)*sum;
        System.out.println(x2+" "+y2+" "+x1+" "+y1);
        }

	
}
} 
