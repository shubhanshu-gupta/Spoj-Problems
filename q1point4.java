import java.util.*;
import java.io.*;

class q1point4 {
        public static void main(String args[]) throws IOException
        {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String str = in.readLine();
	str = str.trim();
	str = str.replaceAll(" ","%20");
	
	System.out.println(str);
}
}
