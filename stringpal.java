// Type your Java code and click the "Run Code" button!
// Your code output will be shown on the left.
// Click on the "Show input" button to enter input data to be read (from stdin).
import java.io.*;
import java.util.*;

public class stringpal {


    public static void main(String[] args) throws IOException {
       
       
int min=-1;
String s,sub,rev;
StringBuffer temp;
ArrayList<String> arr = new ArrayList<String>();
int len;

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a string");
s = br.readLine();

if(s.length() == 0)
System.out.println("None");

len = s.length();

for(int i = 0; i < len; i++)
{
for(int j = i; j <= len; j++)
{
sub = s.substring(i,j);
if(sub.length() != min){
min=sub.length();
arr.add(sub);
}
}
}

System.out.println("Substring with longest palindrome: " + arr.get((arr.size()-1)));
}
}
        

