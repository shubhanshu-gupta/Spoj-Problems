import java.util.*;
//import java.io.*;

class lastdigSPOJ {
	public static void main(String args[]) //throws IOException
	{
// BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  //int test = Integer.parseInt(in.readLine());

	Scanner in = new Scanner(System.in);
	int test = in.nextInt();
	for(int i=0; i<test; i++)
	{
        int base = in.nextInt();
	int exponent = in.nextInt();


//	 String s = in.readLine();
  //      int base = Integer.parseInt(s.split(" ")[0]);
    //    int exponent = Integer.parseInt(s.split(" ")[1]);



	if(exponent==0)
	{
	System.out.println("1");
	}
	else
	{
	exponent %= 4;
	if(exponent==0)
	{
	exponent=4;
	}
	int answer =1;
	for(int j=0; j<exponent; ++j)
	{
	answer *= base;
	}
	System.out.println(answer%10);
	}
	}

}
}




