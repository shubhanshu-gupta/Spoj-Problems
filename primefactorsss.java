import java.util.*;
import java.io.*;

class primefactorsss {
  public static List<Integer> primeFactors(int number) {
    int n = number;
    List<Integer> factors = new ArrayList<Integer>();
    for (int i = 2; i <= n; i++) {
      while (n % i == 0) {
        factors.add(i);
        n /= i;
      }
    }
    return factors;
 } 

  public static void main(String[] args) throws IOException {
 
 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String st = in.readLine();
        int test = Integer.parseInt(st);

HashSet<Integer> uniq = new HashSet<Integer>();   
int count =0;

for(int j=0; j<test; j++) {

 String str = in.readLine();


        
        int a1 = Integer.parseInt(str.split(" ")[0]);
        int a2 = Integer.parseInt(str.split(" ")[1]);
        int a3 = Integer.parseInt(str.split(" ")[2]);
count =0;
int i = a1;
while(i<=a2){
//for(int i=a1; i<=a2; i++) {
  
  for (Integer integer : primeFactors(i)) {
	uniq.add(integer);
//      System.out.println(integer);


    }
if(uniq.size() == a3)
{
count++;
}	
//System.out.println("/// " + uniq.size() + " ////");
uniq.clear();
       
i++;
}

System.out.println(count);
  }
} }
