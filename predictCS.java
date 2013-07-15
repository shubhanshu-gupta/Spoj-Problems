import java.io.*;
import java.util.*;

class predictCS {
	public static void main(String args[]) throws IOException
	{
	
//	Stopwatch timer = new Stopwatch().start();
//	 long startTime = System.currentTimeMillis();

	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	String s = in.readLine();

	int test = Integer.parseInt(s);
//	System.out.println(test);
	
//	double x=0;

	
	int i;
	for(i=0; i<test; i++)
	{
	String str = in.readLine();

	double prob = Double.parseDouble(str);
	
	double[] max = new double[10001];
	double pro = 1-prob;
	double m=0;

	if((prob*(1+(2*pro))) > (pro*(1+(2*prob))))
	{
	m = (prob*(1+(2*pro)))*10000;
	}
	else
	{
	m = (pro*(1+(2*prob)))*10000;
	}

/*	for(int j=0;j<=10000;j++)
	{
	max[j] = (((2*pro*j)+j)*prob) + ((10000-j)*prob*2*pro);	

	if(max[j]>m)
	{
	m=max[j];
	}
	}
*/	
/*
	for(int k=0; k<10000; k++)
	{
	if(max[k]>max[k+1])
	{
	m=max[k];
	}
	else
	{
	m=max[k+1];
	}
	}

*/	
	System.out.println(m);

	}

	
  //    long stopTime = System.currentTimeMillis();
   //   long elapsedTime = stopTime - startTime;
     // System.out.println(elapsedTime);
/*

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int k = Integer.parseInt(br.readLine());
Map<Integer, Double> readNumbers = new HashMap<Integer, Double>();

for (String aNumber : br.readLine()) {
    Integer num = Integer.parseInt(aNumber);
    Double prob = readNumbers.get(num);
    readNumbers.put(num, prob);
}

double m = 0;
double[] max = new double[10001];

for (Integer aNumber : readNumbers.keySet()) {
    double probab = readNumbers.get(aNumber);
    double pro = 1-probab;

	for(int j=0;j<=10000;j++)
        {

	max[j] = (((2*pro*j)+j)*probab) + ((10000-j)*probab*2*pro); 

      if(max[j]>m)
        {
        m=max[j];
        }
   	
 	}
}
System.out.print(m);
*/
}
}
