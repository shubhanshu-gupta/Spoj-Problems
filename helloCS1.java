import java.io.*;
//import java.util.*;


class helloCS1 {
        public static void main(String args[]) throws IOException
        {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String str = in.readLine();
        int test = Integer.parseInt(str);

        double d,r;
        double u,m,c;
	int n;

        for(int i=0; i<test; i++)
        {
        String s = in.readLine();

         d = Double.parseDouble(s.split(" ")[0]);
         u = Double.parseDouble(s.split(" ")[1]);
         n = Integer.parseInt(s.split(" ")[2]);

        double rate = d*u;

        double[] net = new double[n];
        double[] diff = new double[n];

        for(int j=0; j<n; j++)
        {
        String st = in.readLine();

         m = Double.parseDouble(st.split(" ")[0]);
         r = Double.parseDouble(st.split(" ")[1]);
         c = Double.parseDouble(st.split(" ")[2]);

        double cnew = c/m;
        double co = u*r;
        net[j] = co + cnew;
        diff[j] = rate-net[j];
        }

        double max=0;
        int g=0;
        for(int l=0; l<n; l++)
        {
        if(diff[l]>max)
        {
        max = diff[l];
        g=l;
        }
        else
        {
        max = diff[l];
        }
        }

        if(max<0)
        {
        System.out.println("0");
        }
        else
        {
        System.out.println(++g);
        }
    }


}
}


