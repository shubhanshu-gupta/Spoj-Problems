import java.io.*;

class candy3SPOJ {
        public static void main(String args[]) throws IOException
        {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String str = in.readLine();
        int test = Integer.parseInt(str);

        for(int i=0; i<test; i++)
        {
        String s = in.readLine();

        String st = in.readLine();
        long n = Long.parseLong(st);

        long sum=0;
        for(long j=0; j<n; j++)
        {
        long candies = Long.parseLong(in.readLine());
        sum = (sum+candies)%n;
        }

        if(sum==0)
        {
        System.out.println("YES");
        }
        else
        {
        System.out.println("NO");
        }
        }
}
}

