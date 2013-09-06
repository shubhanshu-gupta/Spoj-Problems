// I accept that I saw the solution, then I was able to figure out the algo...


import java.io.*;


class ngmSPOJ {
        public static void main(String args[]) throws IOException
        {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String str = in.readLine();
	
	long n = Long.parseLong(str);
	
	if(n%10 == 0)
	{
	System.out.println("2");
	}
	else
	{
	System.out.println("1");
	System.out.println(n%10);
	}

}
}
