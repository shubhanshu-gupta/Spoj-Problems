import java.io.*;
import java.util.*;

class numfactCS {
/* |||||My old solution in which I was getting TLE|||||||

	public static void main(String args[]) throws IOException
	{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	int test = Integer.parseInt(in.readLine());
	StringTokenizer st;
	int n;
//	int[] a;
	List<Integer> a;

	        for(int i=0; i<test; i++)
 	       {
		n = Integer.parseInt(in.readLine());
		
	//	a = new int[n];
		a = new ArrayList<Integer>(n);
       		st = new StringTokenizer(in.readLine());
		
		
		for(int j=0; j<n; j++)
		{
	//	 a.add(j) = Integer.parseInt(st.nextToken());    
   		a.add(Integer.parseInt(st.nextToken()));
		}
	
		
		
		int product = prod(a);
		System.out.println(factorial(product));
		}
	}
	

	public static int prod(List<Integer> arr)
		{
		 int pdt =1;
                for(int k=0; k<arr.size(); k++)
                {

                pdt = pdt*(arr.get(k));
                }
		return pdt;
		}

	public static int factorial(int pro)
	{
	int fact=0;
                for(int l=1; l<=pro; l++)
                {
                if(pro%l==0)
                {
                fact++;

             	 }
                }
	return fact;
          }

		
		
	
/*		int pdt =1;
		for(int k=0; k<n; k++)
		{
		pdt = pdt*a[k];
		}
		
		for(int l=1; l<=pdt; l++)
		{
		if(pdt%l==0)
		{
		fact++;
		}
		}

		System.out.println(fact);*/
	

//My new solution

    public void solve() throws IOException {
 
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
 
        long ans = 0, sum = 0, count = 0;
        String s[];
        int a[];
        int T = sc.nextInt();
         long primes[] = new long[1000010];
       // int primes[] = new int[10];
        Arrays.fill(primes, 1);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 1000010; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        //  Integer pary[] =  list.toArray(new Integer[list.size()]);
        // System.out.println(Arrays.toString(pary));
 
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            Arrays.fill(primes, 1);
            for (int i = 0; i < N; i++) {
                int m = sc.nextInt();
                if(list.contains(m)){
                    primes[m]++;
                    continue;
                }
               
                for (int j = 2; j <=m ; j++) { 
                    if (m % j == 0 && list.contains(j)) {
                        primes[j]++;
//                        if((m/j)%j==0){
//                            j--;
//                        }
                        m/=j;
                        if(m%j==0){
                            j--;
                        }
                    }
                }
            }
            ans = 1;
            //System.out.println(Arrays.toString(primes));
            for (int i = 0; i < primes.length; i++) {
                ans *= primes[i];
            }
            System.out.println(ans);
 
        }
 
    }
 
    public static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        int i = 2;
        double a = Math.sqrt(Math.abs(n));
        while (i <= a) {
            if (n % i == 0) {
                return false;
            }
            ++i;
        }
        return true;
    }
 
    public static void main(String[] args) throws IOException {
        new numfactCS().solve();
 
    }
}


