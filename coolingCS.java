import java.util.Scanner;
import java.util.Arrays;

public class coolingCS{
        public static void main(String[] args){

               Scanner sc=new Scanner(System.in);
                int t=sc.nextInt();
                for(int i=0;i<t;i++){
                        int x=sc.nextInt();
                        int w[]=new int[x];
                        int p[]=new int[x];
                        for(int j=0;j<x;j++)
                        w[j]=sc.nextInt();
                        int count=0;
                        for(int k=0;k<x;k++)
                        p[k]=sc.nextInt();
                        int sum=0;
                        Arrays.sort( w);
                        Arrays.sort(p);
                        int c=0;
                        int l=p.length-1;
                        for(int k=w.length-1;k>=0;k--){
                                if(w[k]<=p[l]){
                                        c++;
                                        l--;
                                }
                        }
                        System.out.println(c);
                }
 
        }
}
 
