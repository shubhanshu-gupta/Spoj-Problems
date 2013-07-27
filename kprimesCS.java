import java.io.*;
import java.util.*;

class kprimesCS {

	public static List<Integer> primeFactors(int num)
	{
	int n = num;
	List<Integer> factors = new ArrayList<Integer>();

	for(int i=2; i<=n; i++)
	{
	  while(n%i==0)
	  {
		factors.add(i);
		n/=i;
	 }
	}
	return factors;
	}


	public static void main(String args[]) throws IOException
	{
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	String st = in.readLine();
	int test = Integer.parseInt(st);
	//StringTokenizer st;
//	int[] a = new int[3];
	
	HashSet<Integer> uniq = new HashSet<Integer>();
	
	for(int i=0; i<test; i++)
	{
	String str = in.readLine();
	
	
	//for(int j=0; j<3; j++)
	
	int a1 = Integer.parseInt(str.split(" ")[0]);
  	int a2 = Integer.parseInt(str.split(" ")[1]);
   	int a3 = Integer.parseInt(str.split(" ")[2]);

///////////////correct working code in codechef/////////////////////////

	int cnt =0;
	int p = a1;
	while(p<=a2){
	
	//for(int i=a1; i<=a2; i++) {
	
	for (Integer integer : primeFactors(i)) {
		uniq.add(integer);
		// System.out.println(integer);
 		
		}


	if(uniq.size() == a3)
	{
	cnt++;
	}	

	//System.out.println("/// " + uniq.size() + " ////");
	
	uniq.clear();
	
	p++;
	}

	System.out.println(cnt);


//////////////////////////////////////////////////////////


//HashSet<Integer> uniq1 = new HashSet<Integer>();
/*
        List<Integer> factor = new ArrayList<Integer>();
//      int num = a;
        int count = 0;

      //  for(int num=a1; num<=a2; num++)
       // {
	for(int num=a1; num<=a2; num++)
	{
        for(int u=2; u<=num; u++)
        {
                while(num % u == 0)
                {
                uniq.add(u);
                factor.add(u);
                num /= u;
                }
        }
*/
/*        if(uniq.size() == a3)
        {
        count++;
        }
       }
     //   System.out.println(count);
       // }//return factor;

	for(int h=0; h<factor.size(); h++)
	{
	System.out.println(factor.get(h));
	}
*/
///////////////////////////////////////////////////////////










//	System.out.println(a1+" "+a2+" "+a3);
/*
	for(Integer inte : distinctprimes(a1,a2,a3))
	{

	//for (Integer integer : primeFactors(44)) {
      System.out.println(inte);
    	
	}
//	uniq.add(inte);
*/	
		
//	int n = distinctprimes(a1,a2,a3);
//	System.out.println(n);
/*	Iterator it = uniq.iterator();

	while(it.hasNext())
	{
	System.out.println(it.next());
	}
	}*/
	
	
	}
}


/*	public static int distinctprimes(int a,int b, int c)
	{
	HashSet<Integer> uniq1 = new HashSet<Integer>();

	List<Integer> factor = new ArrayList<Integer>();
//	int num = a;
	int count = 0;

	for(int num=a; num<=b; num++)
	{

	for(int u=2; u<=num; u++)
	{
		while(num % u == 0)
		{
		uniq1.add(u);
		factor.add(u);
		num /= u;
		}
	}
	if(uniq1.size() == c)
	{
	count++;
	}
	}
	return count;
	//return factor;
	}*/
}
