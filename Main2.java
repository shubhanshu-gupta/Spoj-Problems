import java.util.Collections;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.*;
class Main {
public static void main(String args[]) throws IOException{
 
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	String str = in.readLine();
	int test = Integer.parseInt(str);
 
 
	for(int i=0; i<test; i++){
		String st1 = in.readLine();
		int n = Integer.parseInt(st1.split(" ")[0]);
		int m = Integer.parseInt(st1.split(" ")[1]);
		String s = in.readLine();
		long sum=0;
		List<Integer> c = new ArrayList<Integer>();
		int u=0;
		while(u<m){
			
			c.add(Integer.parseInt(s.split(" ")[u]));
			u++;
			}
		Collections.sort(c);
		int yahoo=0;
		List <Integer> c1;
		for(int k=0; k<n; k++){
 
			String s1 = in.readLine();
			int bottle = Integer.parseInt(s1.split(" ")[0]);
			c1 = new ArrayList<Integer>();
			int num=Collections.frequency(c,c.get(yahoo));
			if(k==c.get(yahoo)){
				int l=1;
				while(l<=bottle){
					c1.add(Integer.parseInt(s1.split(" ")[l]));
					l++;
				}
 
				Collections.sort(c1);
 
				int h=c1.size()-1;
				int xy=num;
				while(h>=0 && xy>0){
					sum = sum + c1.get(h);
					h--;
					xy--;
				}
				yahoo+=num;	
			}
		}	
		System.out.println(sum);
	}
}
}  
